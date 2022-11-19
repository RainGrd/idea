package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Person {
    //多态
    public void feed(Animal animal){
        //调用动物类的吃方法
        animal.eat();
    }
//    public void feedCat(Cat c){
//        c.eat();
//    }
//    public void feedDog(Dog d) {
//        d.eat();
//    }

}
