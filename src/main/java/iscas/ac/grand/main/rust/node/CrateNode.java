package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CrateNode extends RustNode {
    public CrateNode() {
        children=new ArrayList<>();
        this.nodeType = "CRATE";
    }

    @Override
    public String generateCode() {
        return children.stream()
                .map(RustNode::generateCode)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public RustNode deepCopy() {
        CrateNode copy = new CrateNode();
        if (this.children != null) {
            this.children.forEach(child ->
                    copy.addChild(child.deepCopy())
            );
        }
        return copy;
    }
}