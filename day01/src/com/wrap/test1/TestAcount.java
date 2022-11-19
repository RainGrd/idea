package com.wrap.test1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 15:37:56
 * @description
 *
 *
 *
 *
 *
 */
public class TestAcount {
    public static void main(String[] args) {
        Acount a1 = new Acount();
        Acount a2 = new Acount("drg1224605",2000);
        /*这个方法因为是静态修饰的，一般采用类名去点*/
        Acount.setInterestRate(0.012);
        Acount.setMinMoney(100);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.getInterestRate());
        System.out.println(a2.getMinMoney());
    }

}
