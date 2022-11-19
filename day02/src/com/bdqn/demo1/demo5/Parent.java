package com.bdqn.demo1.demo5;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 15:57:13
 * @description: 主方法
 * @version: 1.0
 * @param： <T>
 * 泛型类派生类子类，子类也是派生类，那么子类的泛型标识要与父类一致
 */
public class Parent <E>{
    private E value;
    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

}
