package com.bdqn.demo3.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class MyExceptionDemo1 {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e) {
            /*返回描述的当前对象的详细信息*/
            System.out.println(e.getMessage()+"\n");
            e.printStackTrace();
        }
    }
    public static void method1() throws Exception {
        method2();
    }
    public static void method2() throws Exception {
        method3();
    }
    public static void method3() throws Exception {
        throw new Exception("在方法method3()中抛出Exception异常");
    }
}
