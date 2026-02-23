package iscas.ac.grand.main.rust;

import iscas.ac.grand.main.rust.node.RustNode;
import iscas.ac.grand.main.rust.node.TypeNode;

import java.util.*;

//public class TypeMutator {
//    private static final Map<String, List<String>> TYPE_MAPPING = new HashMap<String, List<String>>() {
//        {
//           put("usize", Arrays.asList("isize", "u32", "u64"));
//            put( "i32", Arrays.asList("i64", "u32"));
//        }
//    };
//
//    public void mutateType(TypeNode typeNode) {
//        List<String> candidates = TYPE_MAPPING.get(typeNode.getTypeName());
//        if (candidates != null && !candidates.isEmpty()) {
//            Random random = new Random();
//            String newType = candidates.get(random.nextInt(candidates.size()));
//            typeNode.setTypeName(newType);
//        }
//    }
//}

public class TypeMutator  {
    private static final Random random = new Random();

    // 扩展类型映射关系
    private static final Map<String, List<String>> TYPE_MAPPING = new HashMap<String, List<String>>() {
        {
            put("usize", Arrays.asList("isize", "u32", "u64"));
            put("i32",   Arrays.asList("i64", "u32"));
            put("String", Arrays.asList("&str", "Vec<u8>"));
            put("Vec",    Arrays.asList("LinkedList", "ArrayVec"));
        }
    };


    public void mutateType(TypeNode typeNode) {
        // 只变异基础类型名称（保留泛型参数）
        String baseType = typeNode.getTypeName();
        List<String> candidates = TYPE_MAPPING.getOrDefault(
                baseType, Collections.emptyList()
        );

        if (!candidates.isEmpty()) {
            String newType = candidates.get(random.nextInt(candidates.size()));
            typeNode.setTypeName(newType);
        }

        // 递归处理泛型参数
        typeNode.getGenericArgs().forEach(this::mutateType);
    }
}