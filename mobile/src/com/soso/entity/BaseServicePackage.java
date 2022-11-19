package com.soso.entity;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：服务套餐
 */
public abstract class BaseServicePackage {
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    /*价格*/
    private double price;

    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 16:01:00 2022/4/13
     * @param 
     * @return 
     * 方法描述：显示信息
     **/
    public abstract void showInfo();
}
