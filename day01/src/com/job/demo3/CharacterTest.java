package com.job.demo3;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/26 19:21:08
 * @description 测试Character
 */
public class CharacterTest {
    public static void main(String[] args) {
        //  1.在java5之前调用方法实现装箱和拆箱机制
        //  装箱和拆箱
        Character ca1 = Character.valueOf('a'); //  相当于从char类型到character类型的转换，装箱
        char ca2 = ca1.charValue(); //  相当于character类型到char类型的转换，拆箱
        System.out.println("装箱：" + ca1);
        System.out.println("拆箱：" + ca2);

        System.out.println("-------------------------------");
        //  2.从java5开始支持自动装箱和拆箱
        //  自动装箱和自动拆箱
        Character ca3 = 'a';
        char ca4 = ca3;
        System.out.println("自动装箱："+ca3);
        System.out.println("自动拆箱："+ca4);

        System.out.println("------------------------------");
        //  3.实现字符类型的判断以及转换
        System.out.println(Character.isUpperCase(ca1)); //  判断是否为大写字母   false
        System.out.println(Character.isLowerCase(ca1)); //  判断是否为小写字母   true
        System.out.println(Character.isDigit(ca1)); //  判断是否为数字字母   false
        System.out.println("转换为大写字符是：" + Character.toUpperCase(ca1));   //  A
        System.out.println("转换为小写字符是：" + Character.toLowerCase(ca1));   //  a
        char ca5[]={'a','b','c','d','e'};
    }
}
