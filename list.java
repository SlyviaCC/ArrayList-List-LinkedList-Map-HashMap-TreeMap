import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class list {
    public static void main(String[] args) {

        // 创建 List 集合对象
        List<String> list = new ArrayList<String>();

        // 添加元素(这是父类 Collection 带的方法)
        list.add("dzm");
        list.add("xyq");
        System.out.println(list); // [dzm, xyq]

        // 插入元素(这是 List 带的方法)
        list.add(0, "djy");
        list.add(0, "dll");
        System.out.println(list); // [dll, djy, dzm, xyq]

        // 不能插入超过数组长度的索引位置
        // list.add(10, "dlll"); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 4

        // 移除元素(这是父类 Collection 带的方法)，返回删除结果
        // list.remove("dll"); // [djy, dzm, xyq]
        // 移除元素(这是 List 带的方法)，返回被删除的元素
        list.remove(0); // [djy, dzm, xyq]

        // 修改指定索引元素
        list.set(0, "jj");
        System.out.println(list); // [jj, dzm, xyq]

        // 获取指定索引元素
        System.out.println(list.get(0)); // jj

        // 获得迭代器
        Iterator<String> it = list.iterator();

        // 便利迭代器中的元素
        while (it.hasNext()) {
            System.out.println(it.next()); // jj dzm xyq
        }
    }
}
