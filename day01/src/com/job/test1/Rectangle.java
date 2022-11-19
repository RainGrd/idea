package com.job.test1;

import java.awt.*;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 14:20:34
 * @description 长方形类
 * 定义一个长方形类：包含左上角顶点、长、宽、颜色，能够获取和设置大小、颜色、
 * 位置，能够移动位置，能够输出各属性信息。
 */
public class Rectangle{
    //长、宽
    private double width,length;
    //颜色
    private Color color;
    //点类
    private Point p;
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void change(int width,int length){
        this.width = width;
        this.length = length;
    }
    //纵横坐标
    public void move(int dx,int dy){
        this.p.move(dx,dy);
    }
    //重载构造方法
    public Rectangle(Point p,Color color,int width,int length){
        this.color=color;
        this.width = width;
        this.length = length;
        this.p=p;
    }
    //初始化信息
    public Rectangle(int x, int y,Color color,int width,int length) {
        Point p=new Point(x, y);
        this.p=p;
        this.width = 0.0;
        this.width = width;
        this.length=length;
        this.color = color;
    }
    //显示信息
    public void display() {
        System.out.println("长方形的宽："+getWidth()+"\t长方形的长"+getLength());
        System.out.println("长方形的颜色:"+color);
        System.out.println("长方形的位置"+(p.getX()+p.getY()));
    }
}
