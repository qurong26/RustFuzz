package iscas.ac.grand.main.rust.node;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 表示类型节点（如 usize, Vec<String> 等）
public class TypeNode extends RustNode {
    private String typeName;      // 基础类型名称
    private List<TypeNode> genericArgs = new ArrayList<>();  // 泛型参数

    public TypeNode(String baseType) {
        this.nodeType = "TYPE";
        this.typeName = baseType;
    }

    // 获取完整类型表示
    public String getFullType() {
        if (genericArgs.isEmpty()) {
            return typeName;
        }
        return typeName + "<" +
                genericArgs.stream()
                        .map(TypeNode::getFullType)
                        .collect(Collectors.joining(", ")) +
                ">";
    }

    // Getter/Setter
    public String getTypeName() { return typeName; }
    public void setTypeName(String newName) { this.typeName = newName; }
    public List<TypeNode> getGenericArgs() { return genericArgs; }

    @Override
    public String generateCode() {
        return getFullType();
    }

    @Override
    public RustNode deepCopy() {
        TypeNode copy = new TypeNode(this.typeName);
        this.genericArgs.forEach(arg ->
                copy.genericArgs.add((TypeNode) arg.deepCopy())
        );
        return copy;
    }
}