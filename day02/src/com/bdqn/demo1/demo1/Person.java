package com.bdqn.demo1.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 8:34:09
 * @description 主方法
 */
@MyAnnotation
public class Person {
    private  String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
}
