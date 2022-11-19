package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/23 20:41:18
 * @description 测试价格类
 */
public class TestPrice {
    public static void main(String[] args) {
        Discount d= new Discount(10,"手机",2000.0);
        System.out.println(d.getNumber()+"个"+d.getName()+"的总价为"+d.allPrice());
    }
}
