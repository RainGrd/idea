package com.bdqn.abstraction;

/**
 * @author: 段荣贵
 */
public class Cat extends Animal{
    //父类必须要重写父类的方法
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
