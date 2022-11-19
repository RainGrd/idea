package com.bdqn.test1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：多个线程同时操作一个对象,线程不安全，数据混乱
 */
public class TestThread4 implements Runnable {
    /*票数*/
    int ticketNumbers= 10;

    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 18:45:32 2022/4/9
     * @param 
     * @return 
     * 方法描述：重写run()方法
     **/
    @Override
    public void run() {
        while (true){
            if(ticketNumbers<=0){
                break;
            }
            /*使线程进入阻塞状态*/
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*getName()用于当前线程的名字*/
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNumbers--+"张票");
        }
    }

    public static void main(String[] args) {
        /*创建Thread实例*/
        TestThread4 thread = new TestThread4();
        /*启动线程*/
        new Thread(thread,"小明").start();
        new Thread(thread,"老师").start();
        new Thread(thread,"黄牛党").start();
    }
}
