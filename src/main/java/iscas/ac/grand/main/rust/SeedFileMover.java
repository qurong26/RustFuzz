package iscas.ac.grand.main.rust;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeedFileMover {

    public static void main(String[] args) {
        Path sourceDir = Paths.get("source");
        Path generateOutputDir = Paths.get("generate-output/2025-04-23-1");
        Path destDir = Paths.get("source-parse-fail");

        try {
            // 确保目标目录存在
            if (!Files.exists(destDir)) {
                Files.createDirectories(destDir);
            }

            // 收集所有生成变异体的种子基础名称
            Set<String> generatedBases = collectGeneratedBases(generateOutputDir);

            // 处理源目录中的文件
            processSourceFiles(sourceDir, destDir, generatedBases);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Set<String> collectGeneratedBases(Path generateOutputDir) throws IOException {
        Set<String> bases = new HashSet<>();
        Pattern pattern = Pattern.compile("^(.+)-\\d+\\.rs$");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(generateOutputDir, "*.rs")) {
            for (Path file : stream) {
                String fileName = file.getFileName().toString();
                Matcher matcher = pattern.matcher(fileName);
                if (matcher.matches()) {
                    bases.add(matcher.group(1));
                }
            }
        }
        return bases;
    }

    private static void processSourceFiles(Path sourceDir, Path destDir, Set<String> generatedBases) throws IOException {
        try (DirectoryStream<Path> sourceFiles = Files.newDirectoryStream(sourceDir, "*.rs")) {
            for (Path sourceFile : sourceFiles) {
                String fileName = sourceFile.getFileName().toString();
                String baseName = fileName.substring(0, fileName.lastIndexOf('.'));

                if (!generatedBases.contains(baseName)) {
                    Path targetPath = destDir.resolve(fileName);
                    Files.move(sourceFile, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Moved: " + fileName + " to " + targetPath);
                }
            }
        }
    }
}