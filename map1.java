import java.util.HashMap;
import java.util.Map;

public class map1 {
public static void main(String[] args) {

Map<String, Integer> maps = new HashMap<>();
// 添加元素
maps.put("A", 10);
maps.put("B", 20);
maps.put("C", 30);
maps.put("D", 40);
maps.put("E", 50);
maps.put("F", 60);

// 修改元素
maps.replace("F", 65);
 // 删除元素
maps.remove("E");
// 遍历map-原始方法
for (Map.Entry<String, Integer> entry : maps.entrySet()) {
System.out.println("key:" + entry.getKey() + ";value:" + entry.getValue());
}

// 遍历map-forEach方法（Java8新特性）
maps.forEach((k,v)->
System.out.println("key : " + k + "; value : " + v)
);

// 查询元素
int f = maps.get("F");
System.out.println("F的值为:" +  f);

          }
}