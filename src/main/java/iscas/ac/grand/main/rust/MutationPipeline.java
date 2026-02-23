package iscas.ac.grand.main.rust;


import iscas.ac.grand.main.rust.node.RustASTBuilder;
import iscas.ac.grand.main.rust.node.RustNode;
import iscas.ac.grand.main.antlr4.rustParser.RustLexer;
import iscas.ac.grand.main.antlr4.rustParser.RustParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MutationPipeline {
    public static void main(String[] args) throws Exception {
        // 1. 解析原始AST
        RustNode originalAst = new RustASTBuilder().visit(
                (ParseTree) new RustParser(
                        new CommonTokenStream(
                                new RustLexer(CharStreams.fromFileName("small-set-for-test/130970.rs"))
                        )
                )
        );

        // 2. 注册变异器
        List<Object> mutators = Arrays.asList(
                new LiteralMutator(),
                new IndexMutator(),
                new StatementSwapMutator()
        );

        // 3. 应用变异
        for (Object mutator : mutators) {
            ((Mutator) mutator).mutate(originalAst);
        }

        // 4. 生成新代码
        String mutatedCode = originalAst.generateCode();
        Files.write(Paths.get("mutated.rs"), mutatedCode.getBytes());
    }

    // 定义一个 Mutator 接口
    public interface Mutator {
        void mutate(RustNode node);
    }

    // 确保每个变异器类都实现了 Mutator 接口
    public static class LiteralMutator implements Mutator {
        public void mutate(RustNode node) {
            // 实现具体的变异逻辑
        }
    }

    public static class IndexMutator implements Mutator {
        public void mutate(RustNode node) {
            // 实现具体的变异逻辑
        }
    }

    public static class StatementSwapMutator implements Mutator {
        public void mutate(RustNode node) {
            // 实现具体的变异逻辑
        }
    }
}