package com.job.test2.circular;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 15:15:24
 * @description 圆形
 */
public class Circle extends Coordinates implements IShapeCompute {
    double radius;
    /**
     * 方法作用：计算面积：πr2
     */
    @Override
    public double getArea() {
        return Math.round(Math.PI*(radius*radius));
    }

    /**
     * 方法作用计算圆的周长：2πr
     */
    @Override
    public double getPerimeter() {
        return Math.round(2*Math.PI*radius);
    }

    @Override
    public void display() {
        System.out.println("圆的周长:"+getPerimeter());
        System.out.println("圆的面积:"+getArea());
        System.out.println("圆的位置为:"+(super.getX()+super.getY()));
    }

    /**
     * 定义构造方法初始化数据
     */
    public Circle(double radius,int x,int y){
        super(x,y);
        this.radius = radius;
    }

}
