package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

// 函数节点（对应 fn main() { ... } ）
public class FunctionNode extends RustNode {
    private final String functionName;

    public FunctionNode(String name) {
        children=new ArrayList<>();
        this.nodeType = "FUNCTION";
        this.functionName = name;
    }

    @Override
    public String generateCode() {
        return "fn " + functionName + "() " + children.get(0).generateCode();
    }

    @Override
    public RustNode deepCopy() {
        FunctionNode copy = new FunctionNode(this.functionName);
        if (this.children != null) {
            this.children.forEach(child ->
                    copy.addChild(child.deepCopy())
            );
        }
        return copy;
    }

    public String getFunctionName() {
        return functionName;
    }
}