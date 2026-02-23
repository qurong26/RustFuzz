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
import java.util.stream.Stream;

public class RustMutatorIOTenStrategies {
    private static final int MUTATION_COUNT_PER_FILE = 2;
    private static final String INPUT_DIR = "test/test";
    private static final String OUTPUT_BASE_DIR = "generate-output";

    public static void main(String[] args) throws Exception {
        String dateDir = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Path outputDir = Paths.get(OUTPUT_BASE_DIR, dateDir + "-enhanced");
        Files.createDirectories(outputDir);

        File inputDirFile = new File(INPUT_DIR);
        if (inputDirFile.exists() && inputDirFile.isDirectory()) {
            File[] files = inputDirFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".rs")) {
                        processFileString(file.toPath(), outputDir);
                    } else if (file.isDirectory()) {
                        File[] subFiles = file.listFiles();
                        if (subFiles != null) {
                            for (File subFile : subFiles) {
                                if (subFile.isFile() && subFile.getName().endsWith(".rs")) {
                                    processFileString(subFile.toPath(), outputDir);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void processFileString(Path inputFile, Path outputDir) {
        try {
            enhancedStringBasedMutation(inputFile, outputDir);
        } catch (IOException ioEx) {
            System.err.println("Enhanced string mutation failed: " + inputFile);
            ioEx.printStackTrace();
        }
    }

    private static void processFileASTAndString(Path inputFile, Path outputDir) {
        try {
            RustNode ast = parseAST(inputFile.toString());

            if (ast instanceof ErrorNode) {
                System.err.println("Parsing failed: " + inputFile);
                try {
                    enhancedStringBasedMutation(inputFile, outputDir);
                } catch (IOException ioEx) {
                    System.err.println("Enhanced string mutation also failed: " + inputFile);
                    ioEx.printStackTrace();
                }
                return;
            }

            for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
                EnhancedRustMutator mutator = new EnhancedRustMutator();
                RustNode mutated = mutator.mutate(safeDeepCopy(ast));

                String fileName = String.format("%s-%d.rs",
                        inputFile.getFileName().toString().replace(".rs", ""), i);
                Path outputPath = outputDir.resolve(fileName);

                Files.write(outputPath,
                        mutated.generateCode().getBytes(),
                        StandardOpenOption.CREATE);
            }
        } catch (Exception e) {
            System.err.println("File processing failed: " + inputFile);
            e.printStackTrace();

            try {
                enhancedStringBasedMutation(inputFile, outputDir);
            } catch (IOException ioEx) {
                System.err.println("Enhanced string mutation also failed: " + inputFile);
                ioEx.printStackTrace();
            }
        }
    }

    private static void enhancedStringBasedMutation(Path inputFile, Path outputDir) throws IOException {
        String original = new String(Files.readAllBytes(inputFile));

        for (int i = 1; i <= MUTATION_COUNT_PER_FILE; i++) {
            String mutated = EnhancedStringMutator.mutate(original);
            String fileName = String.format("%s-str%d.rs",
                    inputFile.getFileName().toString().replace(".rs", ""), i);
            Path outputPath = outputDir.resolve(fileName);
            Files.write(outputPath, mutated.getBytes(), StandardOpenOption.CREATE);
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

            RustASTBuilder builder = new RustASTBuilder();
            return builder.visit(tree);
        } catch (Exception e) {
            return new ErrorNode();
        }
    }
}

class EnhancedRustMutator {
    private Random random = new Random();

    public RustNode mutate(RustNode node) {
        int strategy = random.nextInt(10);

        switch (strategy) {
            case 0:
                return mutateOwnershipPatterns(node);
            case 1:
                return mutateLifetimeAnnotations(node);
            default:
                return node;
        }
    }

    private RustNode mutateOwnershipPatterns(RustNode node) {
        return node;
    }

    private RustNode mutateLifetimeAnnotations(RustNode node) {
        return node;
    }
}

class EnhancedStringMutator {
    private static Random random = new Random();

    public static String mutate(String code) {
        String result = code;
        List<Integer> strategies = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(strategies);
        for (int i = 0; i < 3; i++) {
            int strategy = strategies.get(i);
            switch (strategy) {
                case 0:
                    result = mutateOwnershipOperators(result);
                    break;
                case 1:
                    result = mutateLifetimeMarkers(result);
                    break;
                case 2:
                    result = mutateTypeAnnotationsStr(result);
                    break;
                case 3:
                    result = mutateMatchPatterns(result);
                    break;
                case 4:
                    result = mutateFunctionKeywords(result);
                    break;
                case 5:
                    result = mutateMacroPatterns(result);
                    break;
                case 6:
                    result = mutateUnsafeKeywords(result);
                    break;
                case 7:
                    result = mutateTraitKeywords(result);
                    break;
                case 8:
                    result = mutateAsyncKeywords(result);
                    break;
                case 9:
                    result = mutateGenericParameters(result);
                    break;
            }
        }
        return result;
    }

    private static String mutateOwnershipOperators(String code) {
        Pattern pattern = Pattern.compile("(&\\s*mut|&|\\*)");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            int pos = matcher.start();
            String[] options = {"&", "&mut", "*"};
            String replacement = options[random.nextInt(options.length)];
            return code.substring(0, pos) + replacement + code.substring(matcher.end());
        }
        return code;
    }

    private static String mutateLifetimeMarkers(String code) {
        Pattern pattern = Pattern.compile("'\\w+");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            int pos = matcher.start();
            String newLifetime = "'" + (char) ('a' + random.nextInt(26));
            return code.substring(0, pos) + newLifetime + code.substring(matcher.end());
        }
        return code;
    }

    private static String mutateTypeAnnotationsStr(String code) {
        String[] types = {"i32", "i64", "u32", "u64", "f32", "f64", "String", "&str", "bool", "usize"};
        Pattern pattern = Pattern.compile(":\\s*\\w+");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            int pos = matcher.start() + 2;
            int end = matcher.end();
            String newType = types[random.nextInt(types.length)];
            return code.substring(0, pos) + newType + code.substring(end);
        }
        return code;
    }

    private static String mutateMatchPatterns(String code) {
        Pattern pattern = Pattern.compile("match\\s+[^{]*\\{[^}]*\\}");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            String matchBlock = matcher.group();
            if (matchBlock.contains("=>")) {
                String[] parts = matchBlock.split("=>");
                if (parts.length > 1) {
                    int changeIndex = random.nextInt(parts.length - 1);
                    String newPart = parts[changeIndex] + "=> " + generateRandomExpression();
                    StringBuilder newMatch = new StringBuilder();
                    for (int i = 0; i < parts.length; i++) {
                        if (i == changeIndex) {
                            newMatch.append(newPart);
                        } else {
                            newMatch.append(parts[i]);
                            if (i < parts.length - 1) {
                                newMatch.append("=>");
                            }
                        }
                    }
                    return code.substring(0, matcher.start()) + newMatch.toString() + code.substring(matcher.end());
                }
            }
        }
        return code;
    }

    private static String mutateFunctionKeywords(String code) {
        Pattern pattern = Pattern.compile("(async\\s+)?(unsafe\\s+)?fn\\s+\\w+");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            String funcDecl = matcher.group();
            String[] options = {
                    funcDecl,
                    funcDecl.replaceFirst("async\\s+", ""),
                    funcDecl.replaceFirst("unsafe\\s+", ""),
                    "async " + funcDecl,
                    "unsafe " + funcDecl,
                    "async unsafe " + funcDecl
            };

            String replacement = options[random.nextInt(options.length)];
            return code.substring(0, matcher.start()) + replacement + code.substring(matcher.end());
        }
        return code;
    }

    private static String mutateMacroPatterns(String code) {
        Pattern pattern = Pattern.compile("!\\w+\\s*!\\([^)]*\\)");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            String macroCall = matcher.group();
            if (macroCall.contains("!")) {
                if (random.nextBoolean() && macroCall.contains(",")) {
                    String[] args = macroCall.split(",");
                    int removeIndex = random.nextInt(args.length - 1) + 1;
                    StringBuilder newMacro = new StringBuilder(args[0]);
                    for (int i = 1; i < args.length; i++) {
                        if (i != removeIndex) {
                            newMacro.append(",").append(args[i]);
                        }
                    }
                    return code.substring(0, matcher.start()) + newMacro.toString() + code.substring(matcher.end());
                } else {
                    String newArg = generateRandomExpression();
                    int insertPos = macroCall.lastIndexOf(')');
                    if (insertPos > 0) {
                        String newMacro = macroCall.substring(0, insertPos) + ", " + newArg + ")";
                        return code.substring(0, matcher.start()) + newMacro + code.substring(matcher.end());
                    }
                }
            }
        }
        return code;
    }

    private static String mutateUnsafeKeywords(String code) {
        Pattern pattern = Pattern.compile("unsafe\\s+\\{");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            return code.substring(0, matcher.start()) + "{" + code.substring(matcher.end());
        } else {
            pattern = Pattern.compile("\\{");
            matcher = pattern.matcher(code);
            if (matcher.find()) {
                return code.substring(0, matcher.start()) + "unsafe {" + code.substring(matcher.start() + 1);
            }
        }
        return code;
    }

    private static String mutateTraitKeywords(String code) {
        Pattern pattern = Pattern.compile("impl\\s+\\w+\\s+for\\s+\\w+");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            String implBlock = matcher.group();
            String[] parts = implBlock.split("\\s+");
            if (parts.length >= 4 && "for".equals(parts[2])) {
                String newImpl = "impl " + parts[3] + " for " + parts[1];
                return code.substring(0, matcher.start()) + newImpl + code.substring(matcher.end());
            }
        }
        return code;
    }

    private static String mutateAsyncKeywords(String code) {
        Pattern pattern = Pattern.compile("async\\s+fn\\s+\\w+");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            return code.substring(0, matcher.start()) +
                    matcher.group().replaceFirst("async\\s+", "") +
                    code.substring(matcher.end());
        } else {
            pattern = Pattern.compile("fn\\s+\\w+");
            matcher = pattern.matcher(code);
            if (matcher.find()) {
                return code.substring(0, matcher.start()) +
                        "async " + matcher.group() +
                        code.substring(matcher.end());
            }
        }
        return code;
    }

    private static String mutateGenericParameters(String code) {
        Pattern pattern = Pattern.compile("<[^>]+>");
        Matcher matcher = pattern.matcher(code);

        if (matcher.find()) {
            String generics = matcher.group();
            if (generics.contains(",")) {
                String[] params = generics.substring(1, generics.length() - 1).split(",");
                if (params.length > 1) {
                    int removeIndex = random.nextInt(params.length);
                    StringBuilder newGenerics = new StringBuilder("<");
                    for (int i = 0; i < params.length; i++) {
                        if (i != removeIndex) {
                            newGenerics.append(params[i]);
                            if (i < params.length - 1) {
                                newGenerics.append(",");
                            }
                        }
                    }
                    newGenerics.append(">");
                    return code.substring(0, matcher.start()) + newGenerics.toString() + code.substring(matcher.end());
                }
            } else {
                String[] typeParams = {"T", "U", "V", "W"};
                String newParam = typeParams[random.nextInt(typeParams.length)];
                String newGenerics = generics.substring(0, generics.length() - 1) + ", " + newParam + ">";
                return code.substring(0, matcher.start()) + newGenerics + code.substring(matcher.end());
            }
        }
        return code;
    }

    private static String generateRandomExpression() {
        String[] expressions = {
                "0", "1", "true", "false", "\"\"", "vec![]", "None", "Some(0)",
                "String::new()", "0.0", "|| {}", "[]", "{}"
        };
        return expressions[random.nextInt(expressions.length)];
    }
}