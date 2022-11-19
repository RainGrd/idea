package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 20:32:10
 * @description 折扣类
 */
public class Discount extends Price{
    double discount;
    /**
     * 方法作用：初始化数据
     *
     * @param number
     * @param name
     */
    public Discount(int number, String name,double price) {
        /*调用父类的构造方法，初始数据*/
        super(number, name,price);
        this.discount=this.setDiscount(number);
    }
    //重写父类方法
    @Override
    public double allPrice(){
        return getNumber()*price*discount;
    }

}
