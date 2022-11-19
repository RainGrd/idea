package com.bdqn.demo1.demo6;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 19:29:23
 * @description: 主方法
 * @version: 1.0
 * @param： 泛型接口的实现类，是一个泛型类，那么要保证实现接口的泛型类泛型标识包含泛型接口的泛型标识
 */
public class Pair<T,E> implements IGenerator<T>{
    private T key;
    private E value;

    public E getValue() {
        return value;
    }


    @Override
    public T getKey() {
        return key;
    }

    /**
     * 方法作用：初始化数据
     */
    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }
}
