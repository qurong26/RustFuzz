package iscas.ac.grand.main.antlr4.rustParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class RustIO {

//    public static void main(String[] args) throws Exception {
//
//            CharStream input = CharStreams.fromFileName("small-set-for-test/130970.rs");
//            RustLexer lexer = new RustLexer(input);
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            RustParser parser = new RustParser(tokens);
//            ParseTree tree = parser.crate();
//            System.out.println(tree.toStringTree(parser));
//
//    }
    public static void main(String[] args) {
        Path dirPath = Paths.get("small-set-for-test"); // 替换为实际路径
        try {
            // 递归遍历目录
            Files.walkFileTree(dirPath, new SimpleFileVisitor<Path>() {
                public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) {
                    if (filePath.toString().endsWith(".rs")) {
                        processFile(filePath);
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException e) {
                    System.err.println("访问文件失败: " + file);
                    e.printStackTrace();
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFile(Path filePath) {
        try {
            // 创建字符流并解析文件
            CharStream input = CharStreams.fromPath(filePath);
            RustLexer lexer = new RustLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RustParser parser = new RustParser(tokens);
            ParseTree tree = parser.crate(); // 使用语法中的起始规则

            // 输出结果
            System.out.println("File: " + filePath);
            System.out.println(tree.toStringTree(parser));
            System.out.println(); // 输出空行分隔不同文件
        } catch (IOException e) {
            System.err.println("处理文件失败: " + filePath);
            e.printStackTrace();
        }
    }
}
