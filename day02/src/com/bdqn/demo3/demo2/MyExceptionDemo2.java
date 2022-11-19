package com.bdqn.demo3.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class MyExceptionDemo2 {
    public static void main(String[] args) {
        try {
            /*int c=diride(5,"3");
            int c=diride(5,"23.4");
            int c=diride(5,"0");
            int c=diride(5,null);
            System.out.println("result="+c);*/
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static int diride(int a, String s) throws NullPointerException, NumberFormatException, ArithmeticException {
        int b;
        if (s == null) {
            throw new NullPointerException();
        } else if (!s.matches("^[0-9]*$")) {
            throw new NumberFormatException();
        } else {
            b = Integer.parseInt(s);
        }
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
