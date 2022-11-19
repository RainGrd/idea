package com.bdqn.String;

/**
 * @author: 段荣贵
 */
public class Cat {
    String name;
    String color;
    public Cat(String name, String color){
        this.name=name;
        this.color = color;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "名字"+this.name+"颜色"+this.color ;
    }

    public static void main(String[] args) {
        Cat c=new Cat("小花","红色");
        //直接打印这个对象
        System.out.println(c);
        //默认打印对象，自动的执行这个对象中的toString方法
        System.out.println(c.toString());
    }
}
