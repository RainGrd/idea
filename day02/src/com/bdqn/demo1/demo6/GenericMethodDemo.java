package com.bdqn.demo1.demo6;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 20:25:37
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.genericDisplay(123);
        method.genericDisplay("hello");
        String str="abc";
        String fun = method.fun(str);
        System.out.println(fun);
    }
}
