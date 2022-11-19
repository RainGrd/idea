package com.bdqn.demo1.demo5;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 18:03:35
 * @description: 主方法
 * @version: 1.0
 * @param： 如果子类不是泛型类，那额
 */
public class ChildSecond extends Parent<Integer>{
    @Override
    public Integer getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Integer value) {
        super.setValue(value);
    }
}
