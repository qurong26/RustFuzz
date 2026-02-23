package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

// 静态变量声明节点（对应 static symbol: [usize]; ）
public class StaticItemNode extends RustNode {
    private final String identifier;
    private final String type;

    public StaticItemNode(String id, String type) {
        children=new ArrayList<>();
        this.nodeType = "STATIC_ITEM";
        this.identifier = id;
        this.type = type;
    }

    @Override
    public String generateCode() {
        return "static " + identifier + ": " + type + ";";
    }

    @Override
    public RustNode deepCopy() {
        return new StaticItemNode(
                this.identifier,  // String不可变，直接引用
                this.type         // String不可变，直接引用
        );
    }
}
