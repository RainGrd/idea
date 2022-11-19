package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 8:06:49
 * @description 计算某项物品的价格的类
 */
public class Price {
    double amount;
    String name="";
    double price;
    public Price(double a,String name,double p) {
        this.name = name;
        this.price = p;
        this.amount = a;
    }
    //计算商品价格
    public double AllPrice(){
        return price*amount;
    }
}
