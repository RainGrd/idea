package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Dog extends Animal{
    Animal animal=new Animal();
    //重载
    public Dog(String name){
        //调用父类的设置名字
        animal.setName(name);
    }
    @Override
    public void eat(){
        System.out.println(animal.getName()+"吃骨头");
    }
}
