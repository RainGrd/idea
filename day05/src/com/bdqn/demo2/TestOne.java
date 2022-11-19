package com.bdqn.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestOne {
    public static void main(String[] args) {
        /*创建线程*/
        ThreadOne t1 = new ThreadOne("Tom");
        ThreadOne t2 = new ThreadOne("Peter");
        /*启动线程*/
        t1.start();
        t2.start();
    }
}
