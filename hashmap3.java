package com.zb.study.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//测试HashMap
public class hashmap3 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String,Integer> map = new HashMap<>();
        //存放元素
        map.put("john",1);
        map.put("max",2);
        map.put("mike",3);
        map.put("danny",4);
        map.put("william",5);
        //获取keySet，keySet是map集合中所有key的集合，我们可以通过遍历keySet的方法取出所有的value；
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }
    }
}