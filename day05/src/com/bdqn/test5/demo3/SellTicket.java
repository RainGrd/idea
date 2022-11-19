package com.bdqn.test5.demo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class SellTicket implements Runnable{
    //票数
    private static int tickets=100;

    /*创建Lock锁*/
    private Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            /*使用Lock锁时，要用try-finally配合使用*/
            try{
                lock.lock();
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"卖出第"+tickets+"张票！");
                    /*进行延迟*/
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    /*票数减一*/
                    tickets--;
                }
            }finally {
                /*释放锁*/
                lock.unlock();
            }
        }
    }
}
