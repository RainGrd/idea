package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 15:55:04
 * @description 主方法
 */
public class ItemsTest {
    public static void main(String[] args) {
        Items items = new Items("RedMiK40", 3, 2100.0);
        //调用计算总价的方法
        System.out.println(items.getItemsName()+"的总价为"+items.getTotal());

    }
}
