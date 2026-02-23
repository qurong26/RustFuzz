package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.BlockNode;
import iscas.ac.grand.main.rust.node.RustNode;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StatementSwapMutator {
    public void mutate(BlockNode block) {
        List<RustNode> statements = block.getChildren();
        if (statements.size() > 1) {
            int index = new Random().nextInt(statements.size() - 1);
            Collections.swap(statements, index, index + 1);
        }
    }
}