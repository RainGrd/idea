package com.job.test3.work2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 9:21:08
 * @description 主方法
 */
public class Test {
    public static void main(String[] args) {
        /*向上转型*/
        Animal animal1=new Dog("狗");
        Animal animal2 = new Cat("猫");
        Person person= new Person();
        person.eatAnimal(animal1);
        person.eatAnimal(animal2);
        /*向下转型*/
        Dog dog= (Dog) animal1;
        Cat cat= (Cat) animal2;
        person.drive(dog);
        person.drive(cat);
    }
}
