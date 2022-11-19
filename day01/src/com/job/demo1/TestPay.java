package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 18:48:34
 * @description 测试Pay类
 */
public class TestPay {
    public static void main(String[] args) {
        double a,b,c;
        Pay pay = new Pay();
        //调用3个重载computeNetPay()方法
        a=pay.computeNetPay(240,0,0.88);
        b=pay.computeNetPay(240,0);
        c=pay.computeNetPay(240);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
