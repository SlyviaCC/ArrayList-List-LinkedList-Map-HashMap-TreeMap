package com.zb.study.map;

import java.util.HashMap;
import java.util.Map;

//测试HashMap
public class hashmap2 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String,Integer> map = new HashMap<>();
        //存放元素
        map.put("john",1);
        map.put("max",2);
        map.put("mike",3);
        map.put("danny",4);
        map.put("william",5);
        //输出map
        System.out.println(map);
    }
}