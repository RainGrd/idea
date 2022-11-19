package com.bdqn.test5.demo4;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Box {
    private int milk;
    /*奶箱状态*/
    private boolean status=false;

    /**
     * @param
     * @return 方法描述：存储牛奶的操作
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 14:01:52 2022/4/12
     **/
    public synchronized void put(int milk) {
        /*如果有牛奶，就要等待消费*/
        if(status){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*如果没有牛奶，就生产牛奶*/
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        /*生产完毕之后修改奶箱状态*/
        status=true;
        this.notifyAll();
    }

    /**
     * @param
     * @return 方法描述：
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 14:09:11 2022/4/12
     **/
    public synchronized void get() {
        if(!status){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        /*生产完毕之后修改奶箱状态*/
        status=false;
        /*唤醒其他等待的线程*/
        this.notifyAll();
    }
}
