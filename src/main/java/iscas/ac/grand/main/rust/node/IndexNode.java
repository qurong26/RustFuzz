package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;

public class IndexNode extends RustNode {
    private RustNode array;
    private RustNode index;

    public IndexNode(RustNode arrayNode, RustNode indexNode) {
        children=new ArrayList<>();
        this.nodeType = "INDEX";
        this.array = arrayNode;
        this.index = indexNode;
    }

    @Override
    public String generateCode() {
        return array.generateCode() + "[" + index.generateCode() + "]";
    }

    @Override
    public RustNode deepCopy() {
        return new IndexNode(
                this.array.deepCopy(),
                this.index.deepCopy()
        );
    }

    public RustNode getArray() {
        return array;
    }

    public RustNode getIndex() {
        return index;
    }

    public void setArray(RustNode array) {
        this.array = array;
    }

    public void setIndex(RustNode index) {
        this.index = index;
    }

}
