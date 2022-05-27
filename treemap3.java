import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//测试LinkedHashMap
public class treemap3 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
        long start = System.currentTimeMillis();
        System.out.println("=======put时间=======");
        System.out.println("开始时间：" + start);
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(String.valueOf(i),"value");
        }
        long end = System.currentTimeMillis();
        System.out.println("结束时间：" + end);
        System.out.println("hashMap使用时间：" + (end-start));
        start = System.currentTimeMillis();
        System.out.println("开始时间：" + start);
        for (int i = 0; i < 1000000; i++) {
            linkedHashMap.put(String.valueOf(i),"value");
        }
        end = System.currentTimeMillis();
        System.out.println("结束时间：" + end);
        System.out.println("linkedHashMap使用时间：" + (end-start));
        start = System.currentTimeMillis();
        System.out.println("开始时间：" + start);
        for (int i = 0; i < 1000000; i++) {
            treeMap.put(String.valueOf(i),"value");
        }
        end = System.currentTimeMillis();
        System.out.println("结束时间：" + end);
        System.out.println("treeMap使用时间：" + (end-start));
        System.out.println("=======遍历时间=======");
        start = System.currentTimeMillis();
        System.out.println("开始时间：" + start);
        for (String value : hashMap.values());
        end = System.currentTimeMillis();
        System.out.println("结束时间：" + end);
        System.out.println("hashMap使用时间：" + (end-start));
        start = System.currentTimeMillis();
        System.out.println("开始时间：" + start);
        for (String value : linkedHashMap.values());
        end = System.currentTimeMillis();
        System.out.println("结束时间：" + end);
        System.out.println("hashMap使用时间：" + (end-start));
        start = System.currentTimeMillis();
        System.out.println("开始时间：" + start);
        for (String value : treeMap.values());
        end = System.currentTimeMillis();
        System.out.println("结束时间：" + end);
        System.out.println("treeMap使用时间：" + (end-start));
    }
}