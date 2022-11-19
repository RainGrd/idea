package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 8:26:55
 * @description 测试价格类
 */
public class TestPrice {
    public static void main(String[] args) {
        //一本书，单价为30,10本
        Price p = new Price(10, "书", 30);
        //10台电脑，折扣0.88,单价为2000
        Discount d1 = new Discount(10, "电脑", 0.88, 2000);
        //输出
        System.out.println(p.name+"的价格为："+p.AllPrice());
        System.out.println(d1.name+"的价格为："+d1.AllPrice());

    }
}
