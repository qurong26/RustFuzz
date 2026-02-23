package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;
import java.util.stream.Collectors;

// 宏调用节点（对应 println!("{}", symbol[0]); ）
public class MacroInvocationNode extends RustNode {
    private final String macroName;

    public MacroInvocationNode(String name) {
        children=new ArrayList<>();
        this.nodeType = "MACRO_INVOCATION";
        this.macroName = name;
    }

    @Override
    public String generateCode() {
        return macroName + "!(" + children.stream()
                .map(RustNode::generateCode)
                .collect(Collectors.joining(", ")) + ");";
    }

    @Override
    public RustNode deepCopy() {
        MacroInvocationNode copy = new MacroInvocationNode(this.macroName);
        if (this.children != null) {
            this.children.forEach(child ->
                    copy.addChild(child.deepCopy())
            );
        }
        return copy;
    }
}
