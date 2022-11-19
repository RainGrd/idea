package com.bdqn.demo1.demo6;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 19:28:14
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        String key = apple.getKey();
        System.out.println(key);
        System.out.println("--------------");
        Pair<String,Integer> pair=new Pair<>("段荣贵",18);
        String key1 = pair.getKey();
        System.out.println(key1);
        Integer value = pair.getValue();
        System.out.println(value);
    }
}
