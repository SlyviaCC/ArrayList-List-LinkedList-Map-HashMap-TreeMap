import java.util.LinkedList;


public class linklist {
    public static void main(String[] args)  {
        LinkedList<Integer> list=new  LinkedList();

        //增加
        list.add(1);
        list.add(2);
        list.add(2,100);
        //list.addAll();

        //删除
        list.remove(1);
        list.clear();

        list.add(1);
        list.add(2);

        //查看
        list.indexOf(1);
        list.size();
        int ele=list.get(1);
        System.out.println(ele);
        //修改
        list.add(2,100);
        //toString方法，遍历数组
        System.out.println(list.toString());
        //方法1，for循环
        for (int i = 0; i <list.size() ; i++) {
            int elem2= (int) list.get(i);
            System.out.println(i+"是"+elem2);
        }
        //方法2，for-each循环,必须使用对象输出
        for (Object elem3:list){
            System.out.println(elem3);
        }


        //方法4，Lambda表达式+流程式编程（JDK1.8提供）
        list.forEach((i)-> System.out.println(i));
//      list.forEach(System.out::println); 第二种写法




    }


}
