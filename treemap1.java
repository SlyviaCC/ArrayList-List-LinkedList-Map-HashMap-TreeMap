import java.util.Map;
import java.util.TreeMap;

public class treemap1 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("c","a3");
        map.put("e","a5");
        map.put("b","a2");
        map.put("a","a1");
        map.put("d","a4");
        //默认升序
        System.out.println(map);
    }
}