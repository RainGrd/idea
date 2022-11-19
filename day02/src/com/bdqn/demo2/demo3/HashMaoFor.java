package com.bdqn.demo2.demo3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: duan.rong.gui
 * @date: 2022/4/1 9:34:04
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class HashMaoFor {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","value");
        map.put("2","value2");
        map.put("3","value3");
        /*第一种：获得KeySet的视图---遍历视图(key-->value)*/
        System.out.println("通过Map.keySet()遍历key和value：");
        for (String key:map.keySet()){
            System.out.println("key="+key+" and value="+map.get(key));
        }
        /*第二种：获得EntrySet视图，使用Iterator视图*/
        System.out.println("通过Map.entrySet使用Iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key="+entry.getKey()+" and value"+entry.getValue());
        }
        /*第三种：获得EntrySet视图，使用foreach遍历*/
        System.out.println("使用Map.entrySet使用foreach遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key="+entry.getKey()+" and value="+entry.getValue());
        }
    }
}
