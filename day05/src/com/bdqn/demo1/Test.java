package com.bdqn.demo1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：测试Thread
 */
public class Test {
    public static void main(String[] args) {
        /*用于查看当前运行的是哪个线程*/
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        //创建一个Thread()对象
//        Thread thread = new Thread();

    }
}
