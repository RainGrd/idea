package com.bdqn.demo1.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 8:36:58
 * @description 主方法
 */
public class Student extends Person implements Info{
    /**
     * 方法作用：重写父类的方法
     */
    @Override
    public void walk() {
//        super.walk();
        System.out.println("学生走路");
    }

    @Override
    public void show() {

    }
}
