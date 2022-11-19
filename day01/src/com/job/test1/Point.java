package com.job.test1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 14:19:50
 * @description
 * 定义一个点类：包含横、纵坐标，能够获取和修改坐标，能够移动位置（接收横、纵位移量）
 */
public class Point {
    private int x,y;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }
    public void setY(int y) {
        this.y=y;
    }


    public Point(int abscissa,int ordinate) {
        this.x = abscissa;
        this.y=ordinate;
    }

    //计算纵横坐标
    public void move(int dx,int dy) {
        x+=dx;
        y+=dy;
    }
}
