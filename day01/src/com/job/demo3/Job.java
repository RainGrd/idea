package com.job.demo3;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 13:57:09
 * @description  创建Integer类的对象，并以int型将Integer的值返回
 */
public class Job {
    public static void main(String[] args) {
        Integer integer = new Integer(10);
        //自动拆箱
        int number=integer;
        System.out.println(number);
        //自动装箱
        integer=number;
        System.out.println(integer);
    }


}
