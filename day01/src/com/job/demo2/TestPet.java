package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 11:35:21
 * @description 测试类
 */
public class TestPet {
    public static void main(String[] args) {
        Dog dog = new Dog("狗", 50, 90, "哈士奇");
        dog.print();
        Penguin penguin = new Penguin("企鹅", 60, 90, "10岁");
        penguin.print();
    }
}
