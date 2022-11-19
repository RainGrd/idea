package com.bdqn.demo2.demo3;

import java.util.HashMap;

/**
 * @author: duan.rong.gui
 * @date: 2022/4/1 9:05:50
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        String key;
        Integer value;
        /*添加数据*/
        map.put("001",87);
        map.put("002",86);
        map.put("003",83);
        map.put("004",88);
        System.out.println(map);
        System.out.println("大小"+map.size());
        /*修改003对应的值*/
        map.put("003",84);
        System.out.println(map);
        /*删除指定键的键值对*/
        key="002";
        value=map.remove(key);
        System.out.println(value);
        if (value!=null) {
            System.out.println(key+"-"+value+"删除成功！");
        }else{
            System.out.println(key+"-"+value+"删除失败！");
        }
        key="002";
        value=map.remove(key);
        System.out.println(value);
        if (value!=null) {
            System.out.println(key+"-"+value+"删除成功！");
        }else{
            System.out.println(key+"-"+value+"删除失败！");
        }
        /*判断是否存在某个键，并输出键值对*/
        key="001";
        if(map.containsKey(key)){
            System.out.println(key+"存在，值为："+map.get(key));
        }else{
            System.out.println(key+"键不存在");
        }
        value=84;
        if(map.containsValue(value)){
            /*通过foreach遍历获取键*/
            for(String keyItem : map.keySet()){
                /*并通过get方法返回的值与value比较*/
                if (map.get(keyItem)==value) {
                    System.out.println(value+"值存在，键为："+keyItem);
                }
            }
        }else{
            System.out.println("值"+value+"不存在");
        }
    }
}
