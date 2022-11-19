package com.job.demo2.compute;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 16:50:03
 * @description 主类
 * 利用接口做参数，编写一个计算器，能完成加、减、乘、除运算。
 * （1）定义一个接口Compute，含有一个方法int computer(int n, int m)。
 * （2）设计四个类分别实现此接口，完成加、减、乘、除运算。
 * （3）设计一个类UseCompute，类中含有方法public void useCom(Compute com, int one, int
 * two)，此方法能够用传递过来的对象调用computer()方法完成运算，并输出运算的结果。
 * （4）设计一个主类Test，调用类UseCompute中的方法useCom()完成加、减、乘、除运算。
 * 学校中有教师和学生两类人，而在职研究生既是教师又是学生
 */
public class Test {
    Scanner input = new Scanner(System.in);
    UserCompute ucom = new UserCompute();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Test test=new Test();
        System.out.println("请问你是 1. 学生 2. 教师 3.在职研究生");
        int type = input.nextInt();
        int index = 0;
        while (index == 0) {
            switch (type) {
                case 1:
                    test.calculate();
                    break;
                case 2:
                    test.calculate();
                    break;
                case 3:
                    test.calculate();
                    break;
                default:
                    System.out.println("请重新输入");
                    index = 0;
                    type = input.nextInt();
                    break;
            }
        }
    }
    public void calculate() {
        int type,one,two;
        System.out.println("请选择 1.加 2.减 3.乘 4.除");
        type= input.nextInt();
        System.out.println("请输入第一个数：");
        one = input.nextInt();
        System.out.println("请输入第一个数：");
        two = input.nextInt();
        switch (type) {
            case 1:
                ucom.userCom(new Add(), one, two);
                break;
            case 2:
                ucom.userCom(new Minus(), one, two);
                break;
            case 3:
                ucom.userCom(new Take(), one, two);
                break;
            case 4:
                ucom.userCom(new Except(),one,two);
                break;
            default:
                System.out.println("输入错误!");
                break;
        }

    }
}
