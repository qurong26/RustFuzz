package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;
import java.util.List;

// 所有节点的基类
//public abstract class RustNode {
//    protected String nodeType;
//    protected List<RustNode> children = new ArrayList<>();
//
//    public void addChild(RustNode child) {
//        children.add(child);
//    }
//
//    public List<RustNode> getChildren() {
//        return children;
//    }
//
//    public abstract String generateCode();
//}

// 明确定义RustNode基类
public abstract class RustNode {
    protected String nodeType;
    protected List<RustNode> children = new ArrayList<>();

    public void addChild(RustNode child) {
        children.add(child);
    }

    public abstract String generateCode();

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public List<RustNode> getChildren() {
        return children;
    }

    public void setChildren(List<RustNode> children) {
        this.children = children;
    }

    // 添加深拷贝方法
    public abstract RustNode deepCopy();

}