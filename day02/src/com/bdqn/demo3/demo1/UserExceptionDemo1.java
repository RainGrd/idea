package com.bdqn.demo3.demo1;

import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class UserExceptionDemo1 {
    public static void main(String[] args) {
        int a=10,b;
        System.out.println("请输入被除数：");
        Scanner input = new Scanner(System.in);
        b=input.nextInt();
        try {
            int c=a/b;
            System.out.println(a+"/"+b+"/"+"="+c);
        }catch(Exception e){
            System.out.println("Divide by zero error");
        }
        finally{
            System.out.println("这是finally语句");
        }
        System.out.println("After try-catch.");
    }
}
