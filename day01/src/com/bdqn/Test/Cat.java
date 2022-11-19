package com.bdqn.Test;

/**
 * @author: 段荣贵
 */
public class Cat {
    String name;
    String color;
    public Cat(String name, String color) {
        this.color = color;
        this.name = name;
    }
    //重写父类的方法
    public boolean equals(Cat c){
        if(this.color == c.color){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Cat c1=new Cat("小花","红色");
        Cat c2=new Cat("小花","红色");
//        System.out.println(c1==c2);     //false 默认判断两个对象的地址是否一致，一帮用在基本数据类型上
//        System.out.println(c1.equals(c2));      //false Object的equals方法
        System.out.println(c1.equals(c2));      //true 子类的equals方法
    }
}
