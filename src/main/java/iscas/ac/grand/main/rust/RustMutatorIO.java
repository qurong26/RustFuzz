package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.ErrorNode;
import iscas.ac.grand.main.rust.node.FunctionNode;
import iscas.ac.grand.main.rust.node.RustASTBuilder;
import iscas.ac.grand.main.rust.node.RustNode;
import iscas.ac.grand.main.antlr4.rustParser.RustLexer;
import iscas.ac.grand.main.antlr4.rustParser.RustParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RustMutatorIO {
//    public static void main(String[] args) throws Exception {
//        // 解析原始代码
//        RustNode ast = parseAST("small-set-for-test/130970.rs");
//
//        // 应用变异
//        RustMutator mutator = new RustMutator();
//        RustNode mutatedAst = mutator.mutate(ast);
//
//        // 生成新代码
//        String newCode = mutatedAst.generateCode();
//        System.out.println("Mutated Code:\n" + newCode);
//    }
// 配置参数
private static final int MUTATION_COUNT_PER_FILE = 3; // 每个文件生成3个变体
//    private static final String INPUT_DIR = "small-set-for-test";//包含
//    private static final String INPUT_DIR = "source";//可以解析的种子程序
    private static final String INPUT_DIR = "source-parse-fail";//无法解析的种子程序
//    private static final String INPUT_DIR = "test-cases";//只包含一个种子程序
    private static final String OUTPUT_BASE_DIR = "generate-output";

    public static void main(String[] args) throws Exception {
        // 创建日期格式的输出目录
//        String dateDir = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String dateDir = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Path outputDir = Paths.get(OUTPUT_BASE_DIR, dateDir+"-6");
        Files.createDirectories(outputDir);

        // 遍历输入目录
//        try (Stream<Path> paths = Files.walk(Paths.get(INPUT_DIR))) {
//            paths.filter(Files::isRegularFile)
//                    .filter(p -> p.toString().endsWith(".rs"))
//                    .forEach(p -> processFile(p, outputDir));
//        }
        // 遍历输入目录
        File inputDirFile = new File(INPUT_DIR);
        if (inputDirFile.exists() && inputDirFile.isDirectory()) {
            File[] files = inputDirFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".rs")) {
                        processFile(file.toPath(), outputDir);
                    } else if (file.isDirectory()) {
                        // 递归遍历子目录
                        File[] subFiles = file.listFiles();
                        if (subFiles != null) {
                            for (File subFile : subFiles) {
                                if (subFile.isFile() && subFile.getName().endsWith(".rs")) {
                                    processFile(subFile.toPath(), outputDir);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * qurong
     * 2025-8-12
     * 如果解析失败则按照直接根据字符串按照规则来变异处理
     * @param inputFile
     * @param outputDir
     */
    private static void processFile(Path inputFile, Path outputDir) {
        try {
            // 解析原始AST
            RustNode ast = parseAST(inputFile.toString());

            if (ast instanceof ErrorNode) {
                System.err.println("解析失败: " + inputFile);
                // 尝试使用字符串变异
                stringBasedMutation(inputFile, outputDir);
                return;
            }

            // 生成多个变体（AST变异）
            for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
                RustMutator mutator = new RustMutator();
                RustNode mutated = mutator.mutate(safeDeepCopy(ast)); // 需要实现深拷贝方法

                // 生成输出路径
                String fileName = String.format("%s-%d.rs",
                        inputFile.getFileName().toString().replace(".rs", ""), i);
                Path outputPath = outputDir.resolve(fileName);

                // 写入文件
                Files.write(outputPath,
                        mutated.generateCode().getBytes(),
                        StandardOpenOption.CREATE);
            }
        } catch (Exception e) {
            System.err.println("处理文件失败: " + inputFile);
            e.printStackTrace();

            // 即使发生异常也尝试字符串变异
            try {
                stringBasedMutation(inputFile, outputDir);
            } catch (IOException ioEx) {
                System.err.println("字符串变异也失败: " + inputFile);
                ioEx.printStackTrace();
            }
        }
    }

//    private static void stringBasedMutation(Path inputFile, Path outputDir) throws IOException {
//        // 读取源文件内容
//        String original = new String(Files.readAllBytes(inputFile));
//
//        // 生成多个变体
//        for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
//            String mutated = simpleStringMutation(original);
//            String fileName = String.format("%s-str%d.rs",
//                    inputFile.getFileName().toString().replace(".rs", ""), i);
//            Path outputPath = outputDir.resolve(fileName);
//            Files.write(outputPath, mutated.getBytes(), StandardOpenOption.CREATE);
//        }
//    }

    private static String simpleStringMutation(String original) {
        // 如果字符串为空或太短，使用更安全的变异策略
        if (original == null || original.isEmpty()) {
            return original;
        }

        Random random = new Random();
        int mutationType = random.nextInt(4); // 0:插入, 1:删除, 2:替换, 3:交换相邻字符

        // 随机选择变异位置
        int pos = random.nextInt(original.length());
        char c = getRandomValidChar(random); // 获取更合适的随机字符

        switch (mutationType) {
            case 0: // 插入
                return original.substring(0, pos) + c + original.substring(pos);

            case 1: // 删除
                if (original.length() == 1) return "";
                return original.substring(0, pos) + original.substring(pos + 1);

            case 2: // 替换
                char[] chars = original.toCharArray();
                chars[pos] = c;
                return new String(chars);

            case 3: // 交换相邻字符（更安全的变异）
                if (original.length() < 2) return original;
                int swapPos = Math.min(pos, original.length() - 2);
                char[] swapChars = original.toCharArray();
                char temp = swapChars[swapPos];
                swapChars[swapPos] = swapChars[swapPos + 1];
                swapChars[swapPos + 1] = temp;
                return new String(swapChars);

            default:
                return original;
        }
    }

    // 生成更适合Rust代码的随机字符
    private static char getRandomValidChar(Random random) {
        // 80%概率使用字母数字，20%概率使用符号
        if (random.nextDouble() < 0.8) {
            if (random.nextBoolean()) {
                return (char) (random.nextInt(26) + 'a'); // 小写字母
            } else {
                return (char) (random.nextInt(10) + '0'); // 数字
            }
        } else {
            // Rust代码中常见的符号
            char[] symbols = {'{', '}', '(', ')', '[', ']', '<', '>', '=', '+', '-', '*', '/', ';', ':', ',', '.', '_', '&', '|', '!'};
            return symbols[random.nextInt(symbols.length)];
        }
    }


    /**
     * qurong
     * 2025-8-12
     * 解析失败应用字符串上的变异策略
     * @param inputFile
     * @param outputDir
     * @throws IOException
     */
    private static void stringBasedMutation(Path inputFile, Path outputDir) throws IOException {
        // 读取源文件内容
        String original = new String(Files.readAllBytes(inputFile));

        // 生成多个变体
        for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
            String mutated = mutateStringLiterals(original);//先应用字符串变异策略
            mutated = StringBasedMutator.mutate(mutated);//再应用其它变异策略
            String fileName = String.format("%s-str%d.rs",
                    inputFile.getFileName().toString().replace(".rs", ""), i);
            Path outputPath = outputDir.resolve(fileName);
            Files.write(outputPath, mutated.getBytes(), StandardOpenOption.CREATE);
        }
    }

//    private static void stringBasedMutation(Path inputFile, Path outputDir) throws IOException {
//        // 读取源文件内容
//        String original = new String(Files.readAllBytes(inputFile));
//
//        // 生成多个变体
//        for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
//            String mutated = mutateStringLiterals(original);
//            String fileName = String.format("%s-str%d.rs",
//                    inputFile.getFileName().toString().replace(".rs", ""), i);
//            Path outputPath = outputDir.resolve(fileName);
//            Files.write(outputPath, mutated.getBytes(), StandardOpenOption.CREATE);
//        }
//    }

    private static String mutateStringLiterals(String original) {
        // 使用正则表达式匹配所有字符串字面量
        Pattern pattern = Pattern.compile(
                "(\"([^\"\\\\]|\\\\.)*\")|" +  // 普通字符串
                        "(b\"([^\"\\\\]|\\\\.)*\")|" + // 字节字符串
                        "(r(#*)\"([^\"]|\\\"[^\"])*\"\\5)" // 原始字符串
        );

        Matcher matcher = pattern.matcher(original);
        List<StringMatch> matches = new ArrayList<>();

        // 收集所有匹配的字符串及其位置
        while (matcher.find()) {
            String fullMatch = matcher.group();
            String content = extractStringContent(fullMatch);
            matches.add(new StringMatch(matcher.start(), matcher.end(), fullMatch, content));
        }

        // 如果没有找到字符串，使用简单变异
        if (matches.isEmpty()) {
            return simpleStringMutation(original);
        }

        // 随机选择一个字符串进行变异
        Random random = new Random();
        StringMatch selected = matches.get(random.nextInt(matches.size()));

        // 变异字符串内容
        String mutatedContent = mutateStringContent(selected.content, random);
        String mutatedString = rebuildString(selected.fullMatch, mutatedContent);

        // 替换原始字符串
        return original.substring(0, selected.start) +
                mutatedString +
                original.substring(selected.end);
    }

    // 提取字符串内容（不包括引号和前缀）
    private static String extractStringContent(String fullString) {
        if (fullString.startsWith("b\"")) {
            return fullString.substring(2, fullString.length() - 1);
        } else if (fullString.startsWith("r")) {
            int hashCount = 0;
            while (fullString.charAt(1 + hashCount) == '#') {
                hashCount++;
            }
            int start = 1 + hashCount + 1; // 跳过 r#..."
            return fullString.substring(start, fullString.length() - 1 - hashCount);
        } else {
            return fullString.substring(1, fullString.length() - 1);
        }
    }

    // 变异字符串内容
    private static String mutateStringContent(String content, Random random) {
        if (content.isEmpty()) {
            return String.valueOf((char) (random.nextInt(26) + 'a'));
        }

        int mutationType = random.nextInt(3);
        int pos = random.nextInt(content.length());

        switch (mutationType) {
            case 0: // 插入
                char insertChar = getRandomAsciiChar(random);
                return content.substring(0, pos) + insertChar + content.substring(pos);

            case 1: // 删除
                return content.substring(0, pos) + content.substring(pos + 1);

            case 2: // 替换
                char[] chars = content.toCharArray();
                chars[pos] = getRandomAsciiChar(random);
                return new String(chars);

            default:
                return content;
        }
    }

    // 重建完整字符串（包括引号和前缀）
    private static String rebuildString(String original, String newContent) {
        if (original.startsWith("b\"")) {
            return "b\"" + newContent + "\"";
        } else if (original.startsWith("r")) {
            int hashCount = 0;
            while (original.charAt(1 + hashCount) == '#') {
                hashCount++;
            }
            String hashes = repeat('#', hashCount);
            return "r" + hashes + "\"" + newContent + "\"" + hashes;
        } else {
            return "\"" + newContent + "\"";
        }
    }

    // 自定义字符串重复方法
    private static String repeat(char c, int count) {
        if (count <= 0) return "";
        char[] chars = new char[count];
        Arrays.fill(chars, c);
        return new String(chars);
    }

    // 获取随机ASCII字符（避免控制字符）
    private static char getRandomAsciiChar(Random random) {
        // ASCII 32-126 是可打印字符
        return (char) (random.nextInt(94) + 32);
    }

    // 辅助类记录字符串匹配位置
    static class StringMatch {
        int start;
        int end;
        String fullMatch;
        String content;

        public StringMatch(int start, int end, String fullMatch, String content) {
            this.start = start;
            this.end = end;
            this.fullMatch = fullMatch;
            this.content = content;
        }
    }



//    private static void processFile(Path inputFile, Path outputDir) {
//        try {
//            // 解析原始AST
//            RustNode ast = parseAST(inputFile.toString());
//            if (ast instanceof ErrorNode) {
//                System.err.println("解析失败: " + inputFile);
//                // 尝试使用字符串变异
//                stringBasedMutation(inputFile, outputDir);
//                return;
//            }
//            // 生成多个变体（AST变异）
//            for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
//                RustMutator mutator = new RustMutator();
//                RustNode mutated = mutator.mutate(safeDeepCopy(ast)); // 需要实现深拷贝方法
//                // 生成输出路径
//                String fileName = String.format("%s-%d.rs",
//                        inputFile.getFileName().toString().replace(".rs", ""), i);
//                Path outputPath = outputDir.resolve(fileName);
//                // 写入文件
//                Files.write(outputPath,
//                        mutated.generateCode().getBytes(),
//                        StandardOpenOption.CREATE);
//            }
//        } catch (Exception e) {
//            System.err.println("处理文件失败: " + inputFile);
//            e.printStackTrace();
//        }
//    }
//    private static void stringBasedMutation(Path inputFile, Path outputDir) throws IOException {
//        // 读取源文件内容
//        String original = new String(Files.readAllBytes(inputFile));
//        // 生成多个变体
//        for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
//            String mutated = simpleStringMutation(original);
//            String fileName = String.format("%s-str%d.rs",
//                    inputFile.getFileName().toString().replace(".rs", ""), i);
//            Path outputPath = outputDir.resolve(fileName);
//            Files.write(outputPath, mutated.getBytes(), StandardOpenOption.CREATE);
//        }
//    }
//    private static String simpleStringMutation(String original) {
//        // 这里实现一个简单的字符串变异，例如随机选择一个位置进行插入、删除或替换操作
//        // 为了简单，我们可以只实现一种操作，比如随机删除一个字符
//        // 更复杂的可以随机插入、删除、替换等
//        // 注意：不要破坏文件结构（例如，如果文件很短，要避免越界）
//        Random random = new Random();
//        int mutationType = random.nextInt(3); // 0: 插入, 1: 删除, 2: 替换
//        // 如果字符串为空，则直接返回
//        if (original.isEmpty()) {
//            return original;
//        }
//        int pos = random.nextInt(original.length());
//        char c = (char) (random.nextInt(26) + 'a'); // 随机小写字母
//        switch (mutationType) {
//            case 0: // 插入
//                return original.substring(0, pos) + c + original.substring(pos);
//            case 1: // 删除
//                if (original.length() == 1) return "";
//                return original.substring(0, pos) + original.substring(pos + 1);
//            case 2: // 替换
//                char[] chars = original.toCharArray();
//                chars[pos] = c;
//                return new String(chars);
//            default:
//                return original;
//        }
//    }


    /**
     * qurong
     * 2025-4-3
     * 根据解析结果来变异
     * @param inputFile
     * @param outputDir
     */
    private static void processFile1(Path inputFile, Path outputDir) {
        try {
            // 解析原始AST
            RustNode ast = parseAST(inputFile.toString());

            if (ast instanceof ErrorNode) {
                System.err.println("解析失败: " + inputFile);
                return;
            }

            // 生成多个变体
            for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
                RustMutator mutator = new RustMutator();
                RustNode mutated = mutator.mutate(safeDeepCopy(ast)); // 需要实现深拷贝方法

                // 生成输出路径
                String fileName = String.format("%s-%d.rs",
                        inputFile.getFileName().toString().replace(".rs", ""), i);
                Path outputPath = outputDir.resolve(fileName);

                // 写入文件
                Files.write(outputPath,
                        mutated.generateCode().getBytes(),
                        StandardOpenOption.CREATE);
            }
        } catch (Exception e) {
            System.err.println("处理文件失败: " + inputFile);
            e.printStackTrace();
        }
    }
    private static RustNode safeDeepCopy(RustNode node) {
        try {
            return node.deepCopy();
        } catch (Exception e) {
            return new ErrorNode();
        }
    }
    private static RustNode parseAST(String filePath) throws IOException {
        try {
            CharStream input = CharStreams.fromFileName(filePath);
            RustLexer lexer = new RustLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RustParser parser = new RustParser(tokens);
            ParseTree tree = parser.crate();

            System.out.println("File: " + filePath);
            System.out.println(tree.toStringTree(parser));
            System.out.println(); // 输出空行分隔不同文件

            RustASTBuilder builder = new RustASTBuilder();

            return builder.visit(tree);

        }catch (Exception e){
            //e.printStackTrace();
            return new ErrorNode();
        }
    }
}