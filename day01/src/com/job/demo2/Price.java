package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 20:30:02
 * @description 一个需要数量、物品名称和物品的构造方法
 * 1.
 */
public class Price {
    /**
     * 定义商品数量、名字、单价
     */
    private int number;
    private String name;
    double price;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 方法作用：初始化数据
     */
    public Price(int number,String name,double price){
        this.name = name;
        this.number = number;
        this.price=price;
    }
    /**
     *
     *方法作用:计算商品价格：商品数量乘以商品单价
     */
    public double allPrice(){
        return number*price;
    }
    /**
     *
     *方法作用:
     */
    public double setDiscount(int number){
        double discount=0.0;
        if (number>=10 || number<50) {
            discount=9;
        }else if (number >=50 || number<100) {
            discount=8;
        }else if (number>=100) {
            discount=7;
        }
        return (discount/10);
    }
}
