package com.job.test3.work2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 9:18:09
 * @description 主方法
 */
public class Person {
    /**
     * 方法作用:可以喂养任何动物
     */
    public void eatAnimal(Animal animal){
        animal.eat();
    }
    public void drive(IBehavior iBehavior){
        iBehavior.work();
    }

}
