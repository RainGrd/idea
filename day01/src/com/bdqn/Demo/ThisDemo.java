package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class ThisDemo{
    String color;
    int speed;
    int seat=5;
    //设置一个车的方法
    public void run(){
        //方法体里面会有一个this关键字
        //this：当前正在执行这个方法的对象
//        System.out.println(this);
        //在方法体里使用this关键字进行演示
        System.out.println(this.color);
        System.out.println(this.speed);
    }
    public static void main(String[] args) {
        //this关键字演示
        ThisDemo thisDemo= new ThisDemo();
        thisDemo.color="红色";
        thisDemo.speed=120;
        thisDemo.run();
//        System.out.println(thisDemo);
        //不在方法里使用this关键字引用属性
//        System.out.println(thisDemo.color);
        
    }
}
