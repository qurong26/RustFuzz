package iscas.ac.grand.main.rust;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * qurong
 * 2025-8-12
 * 在解析失败时对源程序在符串层面上进行变异操作
 */
public class StringBasedMutator {
    private static final Map<String, List<String>> OPERATOR_MAPPING = new HashMap<String, List<String>>() {{
        put("+", Arrays.asList("-", "*", "/"));
        put("-", Arrays.asList("+", "*", "/"));
        put("*", Arrays.asList("+", "-", "/"));
        put("==", Arrays.asList("!=", ">", "<"));
        put(">", Arrays.asList("<", ">=", "=="));
        put("<", Arrays.asList(">", "<=", "=="));
        put(">=", Arrays.asList("<=", ">", "=="));
        put("<=", Arrays.asList(">=", "<", "=="));
        put("!=", Arrays.asList("==", ">", "<"));
    }};

    private static final List<String> BASIC_TYPES = Arrays.asList(
            "i8", "i16", "i32", "i64", "i128", "isize",
            "u8", "u16", "u32", "u64", "u128", "usize",
            "f32", "f64", "bool", "char", "str"
    );

    private static final Random random = new Random();

    public static String mutate(String code) {
        // 按优先级应用变异策略
        int strategy = random.nextInt(100);

        if (strategy < 30) { // 30% 概率变异字面量
            return mutateLiterals(code);
        } else if (strategy < 60) { // 30% 概率变异操作符
            return mutateOperators(code);
        } else if (strategy < 80) { // 20% 概率变异类型
            return mutateTypes(code);
        } else { // 20% 概率变异块语句
            return mutateBlocks(code);
        }
    }

    // 1. 字面量变异（整数）
    private static String mutateLiterals(String code) {
        // 匹配整数数字（避免匹配到十六进制、二进制等）
        Pattern pattern = Pattern.compile("\\b(\\d+)\\b(?![_xbo])");
        Matcher matcher = pattern.matcher(code);

        List<LiteralMatch> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(new LiteralMatch(matcher.start(), matcher.end(), matcher.group()));
        }

        if (matches.isEmpty()) return code;

        LiteralMatch selected = matches.get(random.nextInt(matches.size()));
        int value = Integer.parseInt(selected.value);
        int delta = random.nextBoolean() ? 1 : -1;
        int mutatedValue = value + delta;

        return code.substring(0, selected.start) + mutatedValue + code.substring(selected.end);
    }

    // 2. 操作符变异
    private static String mutateOperators(String code) {
        // 匹配常见操作符（避免匹配到注释和字符串）
        Pattern pattern = Pattern.compile(
                "\\+|-|\\*|/|==|!=|>|<|>=|<=|&&|\\|\\|" +
                        "(?=(?:(?:(?!//).)*$))");

        Matcher matcher = pattern.matcher(code);
        List<OperatorMatch> matches = new ArrayList<>();

        while (matcher.find()) {
            String operator = matcher.group();
            if (OPERATOR_MAPPING.containsKey(operator)) {
                matches.add(new OperatorMatch(matcher.start(), matcher.end(), operator));
            }
        }

        if (matches.isEmpty()) return code;

        OperatorMatch selected = matches.get(random.nextInt(matches.size()));
        List<String> candidates = OPERATOR_MAPPING.get(selected.operator);
        String newOperator = candidates.get(random.nextInt(candidates.size()));

        return code.substring(0, selected.start) + newOperator + code.substring(selected.end);
    }

    // 3. 类型变异
    private static String mutateTypes(String code) {
        // 匹配基本类型（避免匹配到变量名）
        Pattern pattern = Pattern.compile(
                "\\b(" + String.join("|", BASIC_TYPES) + ")\\b" +
                        "(?![<:])" // 避免匹配泛型参数
        );

        Matcher matcher = pattern.matcher(code);
        List<TypeMatch> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(new TypeMatch(matcher.start(), matcher.end(), matcher.group()));
        }

        if (matches.isEmpty()) return code;

        TypeMatch selected = matches.get(random.nextInt(matches.size()));
        String newType = getRandomType(selected.type);

        return code.substring(0, selected.start) + newType + code.substring(selected.end);
    }

    // 4. 块语句变异（交换相邻语句）
    private static String mutateBlocks(String code) {
        // 匹配代码块（花括号内的内容）
        Pattern pattern = Pattern.compile("\\{([^}{]*)\\}");
        Matcher matcher = pattern.matcher(code);

        List<BlockMatch> matches = new ArrayList<>();
        while (matcher.find()) {
            String blockContent = matcher.group(1);
            // 只处理包含多个语句的块
            if (blockContent.split(";").length > 2) {
                matches.add(new BlockMatch(matcher.start(1), matcher.end(1), blockContent));
            }
        }

        if (matches.isEmpty()) return code;

        BlockMatch selected = matches.get(random.nextInt(matches.size()));
        String mutatedContent = swapAdjacentStatements(selected.content);

        return code.substring(0, selected.start) + mutatedContent + code.substring(selected.end);
    }

    // 辅助方法：获取随机类型（保持同类型）
    private static String getRandomType(String original) {
        String category = original.startsWith("i") ? "int" :
                original.startsWith("u") ? "uint" :
                        original.startsWith("f") ? "float" :
                                "other";

        List<String> candidates = BASIC_TYPES.stream()
                .filter(t -> {
                    if (category.equals("int")) return t.startsWith("i");
                    if (category.equals("uint")) return t.startsWith("u");
                    if (category.equals("float")) return t.startsWith("f");
                    return t.equals("bool") || t.equals("char") || t.equals("str");
                })
                .collect(Collectors.toList());

        // 排除自身
        candidates.remove(original);

        if (candidates.isEmpty()) return original;
        return candidates.get(random.nextInt(candidates.size()));
    }

    // 辅助方法：交换相邻语句
    private static String swapAdjacentStatements(String blockContent) {
        // 分割语句（保留分号）
        String[] statements = blockContent.split("(?<=;)");
        if (statements.length < 2) return blockContent;

        // 选择要交换的位置（排除开头和结尾）
        int pos = random.nextInt(statements.length - 1);

        // 交换相邻语句
        String temp = statements[pos];
        statements[pos] = statements[pos + 1];
        statements[pos + 1] = temp;

        return String.join("", statements);
    }

    // 辅助类：记录匹配位置和值
    static class LiteralMatch {
        int start, end;
        String value;
        LiteralMatch(int start, int end, String value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
    }

    static class OperatorMatch {
        int start, end;
        String operator;
        OperatorMatch(int start, int end, String operator) {
            this.start = start;
            this.end = end;
            this.operator = operator;
        }
    }

    static class TypeMatch {
        int start, end;
        String type;
        TypeMatch(int start, int end, String type) {
            this.start = start;
            this.end = end;
            this.type = type;
        }
    }

    static class BlockMatch {
        int start, end;
        String content;
        BlockMatch(int start, int end, String content) {
            this.start = start;
            this.end = end;
            this.content = content;
        }
    }
}