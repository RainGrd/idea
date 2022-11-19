package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 8:21:36
 * @description 主方法
 */
public class Discount extends Price{
    double discount=8.0;   //默认折扣
    public Discount(int count,String name,double discount,double price) {
        //父类的构造方法
        super(count,name,price);
        this.discount = discount;

    }
    //重写父类计算方法
    @Override
    public double AllPrice(){
        return amount*price*discount;
    }
}
