package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Construction {
    String color;
    int speed;
    int seat=5;
    //设置方法
    public void run(){

        System.out.println(this.color+"颜色的车在跑！");
    }
    //在Java中会自动赠送给每一个类一个无参构造方法
    //构造方法

    public Construction(String color,int speed){    //设置属性信息
        System.out.println("你好！我是构造方法");
        this.color=color;
        this.speed=speed;
    }
    public static void main(String[] args) {
        //构造方法演示
        Construction con1= new Construction("绿色",180);
        Construction con2= new Construction("红色",150);
        con1.run();
        con2.run();
    }
}
