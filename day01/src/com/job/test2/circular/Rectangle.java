package com.job.test2.circular;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 15:48:53
 * @description 矩形类
 */
public class Rectangle implements IShapeCompute {
    /*定义长和宽*/
    double width,length;
    /**
     *
     * @return 长方形的周长公式：长加宽*2
     */
    @Override
    public double getArea() {
        return Math.round((width*length)*2);
    }

    /**
     * @return 长方形的面积公式：长乘宽
     */
    @Override
    public double getPerimeter() {
        return Math.round(width * length);
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("矩形的周长:"+getPerimeter());
        System.out.println("矩形的面积:"+getArea());
    }

    /**
     * 方法作用：初始化数据
     */
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
}
