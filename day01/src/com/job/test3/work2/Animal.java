package com.job.test3.work2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 9:13:22
 * @description 动物类
 */
public abstract class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;

    /**
     * 方法作用：吃
     */
    abstract void eat();
}
