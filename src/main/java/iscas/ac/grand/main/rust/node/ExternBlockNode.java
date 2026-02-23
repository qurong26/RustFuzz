package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

// 外部块节点（对应 extern "C" { ... } ）
public class ExternBlockNode extends RustNode {
    private final String abi;

    public ExternBlockNode(String abi) {
        children=new ArrayList<>();
        this.nodeType = "EXTERN_BLOCK";
        this.abi = abi;
    }

    @Override
    public String generateCode() {
        return "extern \"" + abi + "\" " + children.get(0).generateCode();
    }

    @Override
    public RustNode deepCopy() {
        ExternBlockNode copy = new ExternBlockNode(this.abi);
        if (this.children != null) {
            this.children.forEach(child ->
                    copy.addChild(child.deepCopy())
            );
        }
        return copy;
    }

    public String getAbi() {
        return abi;
    }
}
