package com.bdqn.demo1.demo5;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 16:23:57
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Test {
    public static void main(String[] args) {
        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("abc");
        String value=childFirst.getValue();
        System.out.println(value);
        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(100);
        Integer value1 = childSecond.getValue();
        System.out.println(value1);
    }
}
