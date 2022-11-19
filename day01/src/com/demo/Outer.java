package com.demo;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/26 16:16:01
 * @description 主方法
 */
public class Outer {
    /**
     *
     *请在三个println 后括号中填空使得输出25,20,18
     */
    private int age=18;
    class Inner{
        public int age=20;
        public void showAge(){
            int age=25;
            System.out.println(age);//空1
            System.out.println(this.age);//空2
            System.out.println(Outer.this.age);//空3
        }
    }
    public static void main(String[] args) {
        Outer.Inner oi= new Outer().new Inner();
        oi.showAge();
    }
}
