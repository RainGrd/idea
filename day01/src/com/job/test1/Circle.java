package com.job.test1;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 10:54:49
 * @description 主方法
 */
public class Circle {
    Scanner input=new Scanner(System.in);
    double radius=0.0;
    double perimeter=0.0;
    double area=0.0;
    //pl只用出现一次即可，所以用static关键字修饰也可以用final修饰成为常量
    static double pl=3.14;
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        //圆的周长公式 2πr
        //Math.round()方法用于控制小数点
        this.perimeter =Math.round(2*pl*this.radius);
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        //圆的面积公式πr2的平方
        //Math.round()方法用于控制小数点
        this.area = Math.round(pl*radius*radius);
    }
    public Circle(double r){
        this.radius=r;
        //圆的周长
        setPerimeter();
        //圆的面积
        setArea();
    }
}
