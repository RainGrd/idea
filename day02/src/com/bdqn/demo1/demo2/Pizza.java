package com.bdqn.demo1.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 20:07:45
 * @description 披萨
 *
 */
public class Pizza{
    /*定义：披萨的状态*/
    private PizzaStatus status;

    /***
     *
     * @return status
     * 获取状态
     */
    public PizzaStatus getStatus(){
        return status;
    }
    /**
     *方法作用：设置状态
     */
    public void setStatus(PizzaStatus status){
        this.status = status;
    }

    /***
     *
     * @return flag
     * 是否派送成功
     */
    public boolean isDeliverable(){
        boolean flag=false;
        /**/
        if (this.status.isReady() || this.status.isOrdered() || this.status.isDelivered()) {
            flag=true;
        }
        return flag;
    }

    /**
     * 方法作用：打印输出披萨的派送状态和派送时间
     */
    public void printTimeTODeliver(){
        if (this.isDeliverable()) {
            System.out.println("Time to delivery is "+this.getStatus().getTimeToDelivery());
        }else{
            System.out.println("并未派送");
        }

    }
}
