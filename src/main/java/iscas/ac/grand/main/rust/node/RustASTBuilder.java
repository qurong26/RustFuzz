package iscas.ac.grand.main.rust.node;

import iscas.ac.grand.main.antlr4.rustParser.RustParserBaseVisitor;
import iscas.ac.grand.main.antlr4.rustParser.RustParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class RustASTBuilder extends RustParserBaseVisitor<RustNode> {

    // 转换整个crate（入口点）
    @Override
//    public RustNode visitCrate(RustParser.CrateContext ctx) {
//        CrateNode crate = new CrateNode(); // 直接使用具体类
//        crate.nodeType = "CRATE";
//        ctx.item().forEach(item -> crate.addChild(visit(item)));
//        return crate;
//    }
    public RustNode visitCrate(RustParser.CrateContext ctx) {
        if (ctx == null) return new ErrorNode(); // 新增错误节点处理
        System.out.println("解析Crate: " + ctx.getText());
        CrateNode crate = new CrateNode(); // 直接使用具体类
        crate.nodeType = "CRATE";
        for (RustParser.ItemContext item : ctx.item()) {
            crate.addChild(visit(item));
        }
        return crate;
    }

    private RustNode safeVisit(ParseTree ctx) {
        if(ctx==null){
            System.out.println("ctx is null");
        }
        return ctx != null ? visit(ctx) : new ErrorNode();
    }




    // 转换函数定义
    @Override
    public RustNode visitFunction_(RustParser.Function_Context ctx) {
        if (ctx == null) return new ErrorNode(); // 新增错误节点处理
        System.out.println("解析function: " + ctx.getText());
        String funcName = ctx.identifier().getText();
        FunctionNode func = new FunctionNode(funcName);
        func.addChild(visitBlockExpression(ctx.blockExpression())); // 添加代码块
        return func;
    }

    // 转换代码块
//    @Override
//    public RustNode visitBlockExpression(RustParser.BlockExpressionContext ctx) {
//        BlockNode block = new BlockNode();
//        ctx.statements().statement().forEach(stmt ->
//                block.addChild(visit(stmt))
//        );
//        return block;
//    }
    @Override
    public RustNode visitBlockExpression(RustParser.BlockExpressionContext ctx) {
        BlockNode block = new BlockNode();
        System.out.println("解析block: " + ctx.getText());
        if (ctx != null && ctx.statements() != null) {
            ctx.statements().statement().forEach(stmt -> {
                RustNode node = safeVisit(stmt);
                if (!(node instanceof ErrorNode)) {
                    block.addChild(node);
                }
            });
        }
        return block;
    }

    // 转换外部块
    @Override
    public RustNode visitExternBlock(RustParser.ExternBlockContext ctx) {
        if (ctx == null) return new ErrorNode(); // 新增错误节点处理
        System.out.println("解析Extern: " + ctx.getText());
        String abi = ctx.abi().getText().replace("\"", "");
        ExternBlockNode externBlock = new ExternBlockNode(abi);
        ctx.externalItem().forEach(item ->
                externBlock.addChild(visit(item))
        );
        return externBlock;
    }

    // 转换静态变量声明
    @Override
    public RustNode visitStaticItem(RustParser.StaticItemContext ctx) {
        if (ctx == null) return new ErrorNode(); // 新增错误节点处理
        System.out.println("解析Static Item: " + ctx.getText());
        String id = ctx.identifier().getText();
        String type = ctx.type_().getText();
        return new StaticItemNode(id, type);
    }

    // 转换宏调用
//    @Override
//    public RustNode visitMacroInvocationSemi(RustParser.MacroInvocationSemiContext ctx) {
//        String macroName = ctx.simplePath().getText();
//        MacroInvocationNode macro = new MacroInvocationNode(macroName);
//        // 处理宏参数（示例只处理简单参数）
//        ctx.tokenTree().forEach(tt ->
//                macro.addChild(new LiteralNode("MACRO_ARG", tt.getText()))
//        );
//        return macro;
//    }
    @Override
    public RustNode visitMacroInvocationSemi(RustParser.MacroInvocationSemiContext ctx) {
        if (ctx == null) return new ErrorNode(); // 新增错误节点处理
        System.out.println("解析MacroInvocation: " + ctx.getText());
        MacroInvocationNode node = new MacroInvocationNode(
                ctx.simplePath() != null ? ctx.simplePath().getText() : "unknown_macro"
        );

        // 处理宏参数
        if (ctx.tokenTree() != null) {
            ctx.tokenTree().forEach(tt -> {
                RustNode arg = visit(tt);
                if (arg != null) node.addChild(arg);
            });
        }
        return node;
    }

    @Override
    public RustNode visitType_(RustParser.Type_Context ctx) {
        // 处理基础类型（如 usize）
        if (ctx.typeNoBounds() != null) {
            return visitTypeNoBounds(ctx.typeNoBounds());
        }
        return new ErrorNode();
    }

    @Override
    public RustNode visitTypeNoBounds(RustParser.TypeNoBoundsContext ctx) {
        // 处理泛型类型（如 Vec<String>）
        if (ctx.traitObjectTypeOneBound() != null) {
            return visitTraitObjectTypeOneBound(ctx.traitObjectTypeOneBound());
        }
        if (ctx.typePath() != null) {
            return visitTypePath(ctx.typePath());
        }
        return new ErrorNode();
    }

    @Override
    public RustNode visitTypePath(RustParser.TypePathContext ctx) {
        TypeNode typeNode = new TypeNode(ctx.getText());
        // 处理泛型参数（示例：Vec<T>）
        if (ctx.typePathSegment() != null) {
            ctx.typePathSegment().forEach(seg -> {
                if (seg.genericArgs() != null) {
                    seg.genericArgs().genericArg().forEach(arg -> {
                        typeNode.getGenericArgs().add(
                                (TypeNode) visitGenericArg(arg)
                        );
                    });
                }
            });
        }
        return typeNode;
    }

    @Override
    public RustNode visitGenericArg(RustParser.GenericArgContext ctx) {
        // 处理泛型参数中的类型
        if (ctx.type_() != null) {
            return visitType_(ctx.type_());
        }
        return new ErrorNode();
    }

}