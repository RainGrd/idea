package com.bdqn.test5.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestBox {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Customer customer = new Customer(box);
        /*创建线程对象*/
        Thread t1 = new Thread(producer, "生产者");
        Thread t2 = new Thread(customer,"消费者");
        /*启动线程*/
        t1.start();
        t2.start();
    }
}
