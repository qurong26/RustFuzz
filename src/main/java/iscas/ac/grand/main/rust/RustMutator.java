package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RustMutator {
    public RustNode mutate(RustNode root) {
        if (root == null) return new ErrorNode(); // 新增空检查
        System.out.println("变异前AST: " + root);
        List<RustNode> mutationPoints = findMutationPoints(root);
        if (!mutationPoints.isEmpty()) {
            Random random = new Random();
            applyMutation(mutationPoints.get(random.nextInt(mutationPoints.size())));
        }
        System.out.println("变异后AST: " + root);
        return root;
    }

    private List<RustNode> findMutationPoints(RustNode node) {
        if (node == null) return Collections.emptyList(); // 防御空值
        System.out.println("findMutationPoints前AST: " + node);
        List<RustNode> points = new ArrayList<>();
        if (isMutable(node)) {
            points.add(node);
        }
        for (RustNode child : node.getChildren()) {
            points.addAll(findMutationPoints(child));
        }
        System.out.println("findMutationPoints后AST: " + node);
        return points;
    }

    private boolean isMutable(RustNode node) {
        if (node == null) return false; // 防御空值
        return node instanceof LiteralNode ||
                node instanceof OperatorNode;
    }

    private void applyMutation(RustNode node) {
        if (node == null) return;
        System.out.println("applyMutation前AST: " + node);
        if (node instanceof LiteralNode) {
            mutateLiteral((LiteralNode) node);
        } else if (node instanceof OperatorNode) {
            mutateOperator((OperatorNode) node);
        }if (node instanceof BlockNode) {//增加block变异 交换语句顺序
            BlockMutator blockMutator=new BlockMutator();
            blockMutator.mutateBlock((BlockNode) node);
        } else if (node instanceof TypeNode) {
            TypeMutator typeMutator=new TypeMutator();
            typeMutator.mutateType((TypeNode) node);//只变异基础类型名称（保留泛型参数）
        }
        System.out.println("applyMutation后AST: " + node);
    }

    private static final Map<String, List<String>> OPERATOR_MAPPING = new HashMap<String, List<String>>() {
        {
            put("+", Arrays.asList("-", "*", "/"));
            put("-", Arrays.asList("+", "*", "/"));
            put("*", Arrays.asList("+", "-", "/"));
            put("==", Arrays.asList("!=", ">", "<"));
            put(">", Arrays.asList("<", ">=", "=="));
        }
    };

    public void mutateOperator(OperatorNode node) {
        if (node == null) return; // 防御空值
        System.out.println("mutateOperator前AST: " + node);
        List<String> candidates = OPERATOR_MAPPING.getOrDefault(node.getOperator(), new ArrayList<>());
        if (!candidates.isEmpty()) {
            String newOp = candidates.get(ThreadLocalRandom.current().nextInt(candidates.size()));
            node.setOperator(newOp);
        }
        System.out.println("mutateOperator后AST: " + node);
    }


    private void mutateLiteral(LiteralNode literal) {
        if (literal == null) return; // 防御空值
        System.out.println("mutateLiteral前AST: " + literal);
        if (literal.getNodeType().equals("INT_LITERAL")) {
            int value = Integer.parseInt(literal.getValue());
            value += ThreadLocalRandom.current().nextInt(-1, 2);
            literal.setValue(String.valueOf(value));
        }
        System.out.println("mutateLiteral后AST: " + literal);
    }
}