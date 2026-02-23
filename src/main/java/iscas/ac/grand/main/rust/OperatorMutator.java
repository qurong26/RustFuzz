package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.OperatorNode;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class OperatorMutator {
    // 定义运算符替换规则
    private static final Map<String, List<String>> OPERATOR_MAPPING = new HashMap<String, List<String>>() {
        {
            put("+", Arrays.asList("-", "*", "/"));
            put("-", Arrays.asList("+", "*", "/"));
            put("*", Arrays.asList("+", "-", "/"));
            put("==", Arrays.asList("!=", ">", "<"));
            put(">", Arrays.asList("<", ">=", "=="));
        }
    };

    public void mutate(OperatorNode node) {
        List<String> candidates = OPERATOR_MAPPING.getOrDefault(node.getOperator(), new ArrayList<>());
        if (!candidates.isEmpty()) {
            String newOp = candidates.get(ThreadLocalRandom.current().nextInt(candidates.size()));
            node.setOperator(newOp);
        }
    }
}