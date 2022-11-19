package com.bdqn.demo1.demo3;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 10:00:00
 * @description 泛型类
 * 泛型类的定义：<T>泛型标识-类型形参
 *          T:type创建对象的时候里指定具体的数据类型
 */
public class Generic <T>{
    private T key;
    public Generic(T key) {
        this.key = key;
    }
    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
