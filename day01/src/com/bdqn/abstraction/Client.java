package com.bdqn.abstraction;

/**
 * @author: 段荣贵
 */
public class Client {
    public static void main(String[] args) {
        Animal c= new Cat();    //因为有多态才能抽象类的作用
        c.eat();
    }
}
