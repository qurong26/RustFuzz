package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

public class ErrorNode extends RustNode {
    public ErrorNode() {
        children=new ArrayList<>();
        this.nodeType = "ERROR";
    }
    @Override
    public String generateCode() { return "/* ERROR */"; }
    @Override public RustNode deepCopy() { return new ErrorNode(); }
}