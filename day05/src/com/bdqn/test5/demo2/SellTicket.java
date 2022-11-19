package com.bdqn.test5.demo2;

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

    private Object obj=new Object();
    /**/
    private int x=0;
    @Override
    public void run() {
        while (true){
           if(x%2==0){
               /*利用同步代码块进行多线程的互斥，进行lock锁*/
//               synchronized (obj){
//               synchronized (this){
               /*类*/
               synchronized (SellTicket.class){
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
               }
           }else{
               /*利用同步代码块进行多线程的互斥，进行lock锁*/
               /*synchronized (obj){
                   if(tickets>0){
                       System.out.println(Thread.currentThread().getName()+"卖出第"+tickets+"张票！");
                       *//*进行延迟*//*
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       *//*票数减一*//*
                       tickets--;
                   }
               }*/
               sellTicket();
           }
           x++;
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 11:07:36 2022/4/12
     * @param 
     * @return 
     * 方法描述：利用同步方法进行多线程的互斥
     **/
    private static synchronized void sellTicket(){
        /*利用同步代码块进行多线程的互斥，进行lock锁*/   
        /*synchronized (obj){

        }*/
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
    }
}
