package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 15:49:30
 * @description 主方法
 */
public class Items {
    public String getItemsName() {
        return itemsName;
    }
    //商品名称
    String itemsName="";
    //商品数量
    int itemsNumber=0;
    //商品价格
    double price=0.0;

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.itemsNumber*this.price;
    }
    //商品总价
    double total=0.0;

    /*初始化数据*/
    public Items(String name,int number,double price){
        this.itemsName=name;
        this.itemsNumber=number;
        this.price = price;
        setTotal();
    }
}
