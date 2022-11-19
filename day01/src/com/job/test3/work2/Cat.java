package com.job.test3.work2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 9:26:29
 * @description 主方法
 */
public class Cat extends Animal implements IBehavior{

    @Override
    void eat() {
        System.out.println(getName()+"吃鱼");
    }

    @Override
    public void work() {
        System.out.println("猫吃饱了要去守卫");
    }
    public Cat(String name){
        super.setName(name);
    }
}
