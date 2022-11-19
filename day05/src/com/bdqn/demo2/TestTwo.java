package com.bdqn.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：main方法测试
 */
public class TestTwo {
    public static void main(String[] args) {
        /*创建ThreadTwo对象*/
        ThreadTwo r1 = new ThreadTwo("Tom");
        ThreadTwo r2 = new ThreadTwo("Jerry");
        /*创建线程*/
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        /*启动线程*/
        t1.start();
        t2.start();
    }
}
