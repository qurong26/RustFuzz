package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.IndexNode;
import iscas.ac.grand.main.rust.node.LiteralNode;

public class IndexMutator {
    public void mutate(IndexNode node) {
        // 原始代码：symbol[0]
        int currentIndex = Integer.parseInt(node.getIndex().generateCode());
        node.setIndex(new LiteralNode("INT_LITERAL", String.valueOf(currentIndex + 1)));
    }
}