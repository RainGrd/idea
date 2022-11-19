package com.bdqn.test5.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket ticket = new SellTicket();
        /*启动线程*/
        Thread t1 = new Thread(ticket,"第一个窗口");
        Thread t2 = new Thread(ticket,"第二个窗口");
        Thread t3 = new Thread(ticket,"第三个窗口");
        /*设置优先级*/
        /*启动线程*/
        t1.start();
        t2.start();
        t3.start();
    }
}
