package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Subclass extends superDemo{
    public Subclass() {
        super("武大郎");
        System.out.println("我是子类的构造方法！");

    }
    //子类
    String name="孙悟空";
    public void chi(){
        //在继承当中，形同的成员变量会先使用自己类的变量，在找父类
        System.out.println(this.name+"再吃橘子");
        //可以使用super关键字进行调用父类变量
        System.out.println(super.name+"再吃橘子");

    }

    public static void main(String[] args) {
        Subclass subclass= new Subclass();
        subclass.chi();
    }
}
