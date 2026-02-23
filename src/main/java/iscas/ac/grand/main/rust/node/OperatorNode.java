package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

// 运算符节点（表示如 +, -, * 等操作符）
public class OperatorNode extends RustNode {
    private String operator;
    private RustNode leftOperand;
    private RustNode rightOperand;

    public OperatorNode(String operator, RustNode left, RustNode right) {
        children=new ArrayList<>();
        this.nodeType = "OPERATOR";
        this.operator = operator;
        this.leftOperand = left;
        this.rightOperand = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String newOp) {
        this.operator = newOp;
    }

    @Override
    public String generateCode() {
        return leftOperand.generateCode() + " " + operator + " " + rightOperand.generateCode();
    }

    @Override
    public RustNode deepCopy() {
        return new OperatorNode(
                this.operator,
                this.leftOperand.deepCopy(),
                this.rightOperand.deepCopy()
        );
    }
}