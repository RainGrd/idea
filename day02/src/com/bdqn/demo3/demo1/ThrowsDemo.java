package com.bdqn.demo3.demo1;

import javax.swing.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class ThrowsDemo {
    public static void main(String[] args) throws ArithmeticException,NumberFormatException{
        String s="";
        int b,a=10;
        s= JOptionPane.showInputDialog("Enter an integer number");
        b=Integer.parseInt(s);
        int c=a/b;
        System.out.println(a+"/"+b+"="+c);
    }
}
