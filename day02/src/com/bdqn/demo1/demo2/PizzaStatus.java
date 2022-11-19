package com.bdqn.demo1.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 20:11:06
 * @description 枚举类
 *
 */
public enum PizzaStatus implements IPizzaStatus{
    /**
     * 方法作用：用于判断是否预定
     */
    ORDERED(5){
        @Override
        public boolean isOrdered() {
            return true;
        }
    },
    /**
     * 方法作用：用于判断是否准备就绪
     */
    READY(2){
        @Override
        public boolean isReady() {
            return true;
        }
    },
    /**
     * 方法作用：派送成功
     */
    DELIVERED(0){
        @Override
        public boolean isDelivered(){
            return true;
        }
    };
    /*派送时间*/
    private int timeToDelivery;

    /**
     * 方法作用：创建构造方法:初始化数据
     */
    PizzaStatus(int timeToDelivery){
        this.timeToDelivery = timeToDelivery;
    }
    /*预定*/
    @Override
    public boolean isOrdered(){
        return false;
    }

    /**
     * 方法作用：是否准备准备就绪
     */
    @Override
    public boolean isReady(){
        return false;
    }

    /***
     *
     * @return false
     * 方法作用：判断是否派送
     */
    @Override
    public boolean isDelivered() {
        return false;
    }

    /**
     *
     * @return timeToDelivery
     * 方法作用：获取派送时间
     */
    public int getTimeToDelivery(){
        return timeToDelivery;
    }
}
