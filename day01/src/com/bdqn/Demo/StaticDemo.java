package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class StaticDemo{
    String name;
    //静态变量
    public static String country="大清";
    //地址
    String address;
    //构造方法初始化
    public StaticDemo(String name, String address){
        this.name = name;
        this.address = address;
    }
    public static void main(String[] args) {
        //static静态关键字演示
        StaticDemo staticDemo1= new StaticDemo("赵铁柱","八大胡同");
        StaticDemo staticDemo2 = new StaticDemo("李小花","朝阳门");
        //大清亡了，
        //调用静态变量最好使用类名去点


    }
}
