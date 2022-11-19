package com.job.test1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 10:54:41
 * @description
 * Lander类具有double型的上底、下底、高和面积属性，具有返回面积的功能。
 */
public class Lander {
    double baseUp;  //上底
    double baseDown;    //下底
    double height;  //高
    double area;    //面积

    public double getBaseUp() {
        return baseUp;
    }

    public void setBaseUp() {
        this.baseUp = baseUp;
    }

    public double getBaseDown() {
        return baseDown;
    }

    public void setBaseDown() {
        this.baseDown = baseDown;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public double getArea() {
        return area;
    }
    public void setArea() {
        //梯形的面积公式：（上底+下底）×高÷2。
        this.area = (this.baseUp+this.baseDown)*this.height/2;
    }
    //初始化数据
    public Lander(double up,double down,double height){
        this.baseDown=up;
        this.baseDown=down;
        this.height = height;
        //调用计算面积的方法
        setArea();
    }
}
