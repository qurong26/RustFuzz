package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.BlockNode;
import iscas.ac.grand.main.rust.node.RustNode;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BlockMutator {
    public void mutateBlock(BlockNode block) {
        List<RustNode> statements = block.getChildren();
        if (statements.size() > 1) {
            Random random = new Random();
            int i = random.nextInt(statements.size() - 1);
            Collections.swap(statements, i, i + 1);
        }
    }
}