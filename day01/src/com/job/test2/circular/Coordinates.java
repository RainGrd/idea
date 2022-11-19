package com.job.test2.circular;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 15:14:56
 * @description 坐标类
 */
public class Coordinates {
    /*定义好纵横坐标*/
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;
    public Coordinates(int x,int y){
        this.x = x;
        this.y = y;
    }
    /**
     *
     *方法作用:显示纵横坐标
     */
}
