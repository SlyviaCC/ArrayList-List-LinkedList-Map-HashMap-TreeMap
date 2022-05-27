import java.util.HashMap;
import java.util.Map;

//测试HashMap
public class hashmap1 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String,String> map = new HashMap<>();
        //存放元素
        map.put("Monkey","MonkeyKING");
        //取出元素
        String s = map.get("Monkey");
        System.out.println(s);
        //获取map长度
        int size = map.size();
        System.out.println(size);
        //判断是否包含指定key
        boolean b = map.containsKey("Monkey");
        System.out.println(b);
    }
}