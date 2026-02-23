package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

public class LiteralNode extends RustNode {
    private String value;

    public LiteralNode(String type, String value) {
        children=new ArrayList<>();
        this.nodeType = type;
        this.value = value;
    }

    @Override
    public String generateCode() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public RustNode deepCopy() {
        return new LiteralNode(this.nodeType, this.value);
    }
}