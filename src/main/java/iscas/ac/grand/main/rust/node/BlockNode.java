package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;
import java.util.List;

// 代码块节点（对应 { ... } ）
public class BlockNode extends RustNode {
    public BlockNode() {
        children=new ArrayList<>();
        this.nodeType = "BLOCK";
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder("{\n");
        for (RustNode child : children) {
            sb.append(child.generateCode()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


    @Override
    public RustNode deepCopy() {
        BlockNode copy = new BlockNode();
        if (this.children != null) {
            this.children.forEach(child ->
                    copy.addChild(child.deepCopy())
            );
        }
        return copy;
    }

}