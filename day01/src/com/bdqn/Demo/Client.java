package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Client {
    public static void main(String[] args) {
//        Cat cat= new Cat();
//        Dog dog= new Dog();
//        Person person= new Person();
//        person.feedCat(cat);
//        person.feedDog(dog);
        //创建一个猫
//        Cat cat= new Cat();
        //实现多态的前提：子类需要继承父类
        Animal animal1=new Cat("猫");    //把子类的对象赋值给父类的引用(变量) 向上转型
        //向上转型的缺点：会屏蔽掉子类特有的方法
        Animal animal2=new Dog("狗");
        //新建人
        Person person= new Person();
        //通过继承和实例化，我可以利用父类的方法，运行子类的方法
        person.feed(animal1);
        person.feed(animal2);
        //向下转型父类的变量转化会子类的变量
        Cat cc= (Cat) animal1;
        //调用子类独有的方法
        cc.grabMouse();
        
    }
}
