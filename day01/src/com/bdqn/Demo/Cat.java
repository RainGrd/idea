package com.bdqn.Demo;

import java.util.Date;

/**
 * @author: 段荣贵
 */
//猫是一种动物 -> 继承关系
public class Cat extends Animal{
    Animal a= new Animal();
    public Cat(String name) {
        a.setName(name);
    }
    @Override
   public void eat(){
       System.out.println(a.getName()+"吃鱼");
   }
   //定义子类的独有方法
   public void grabMouse(){
       System.out.println("猫抓老鼠");
   }

}
