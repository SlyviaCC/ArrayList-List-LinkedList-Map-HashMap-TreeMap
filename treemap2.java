import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class treemap2 {
    public static void main(String[] args) {
        //Map<String, String> map = new TreeMap<>(String::compareTo);//这里用了lambda表达式
        //完整表达式
        Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        map.put("c","a3");
        map.put("e","a5");
        map.put("b","a2");
        map.put("a","a1");
        map.put("d","a4");
        //降序
        System.out.println(map);
    }
}