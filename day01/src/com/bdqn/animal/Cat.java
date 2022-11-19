package com.bdqn.animal;

/**
 * @author: 段荣贵
 */
public class Cat extends Animal{
    public static void main(String[] args) {
        Animal a1= new Cat();
        if(a1 instanceof Cat){
            System.out.println("是一只猫");
        }else{
            System.out.println("不是一只猫");
        }
    }
}
