package com.bdqn.demo3.demo1;

import javax.swing.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        String str="";
        int b,a=10;
        try {
            str= JOptionPane.showInputDialog("Enter an integer number");
            b=Integer.parseInt(str);
            int c=a/b;
            System.out.println(a+"/"+b+"="+c);
        }catch (ArithmeticException e){
            System.out.println("Divided by zero!");
        }catch (NumberFormatException e){
            System.out.println("please input integer number");
        }

    }
}
