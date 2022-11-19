package com.job.demo2.compute;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 16:48:23
 * @description
 * 利用接口做参数，编写一个计算器，能完成加、减、乘、除运算。
 * （1）定义一个接口Compute，含有一个方法int computer(int n, int m)。
 * （2）设计四个类分别实现此接口，完成加、减、乘、除运算。
 * （3）设计一个类UseCompute，类中含有方法public void useCom(Compute com, int one, int
 * two)，此方法能够用传递过来的对象调用computer()方法完成运算，并输出运算的结果。
 * （4）设计一个主类Test，调用类UseCompute中的方法useCom()完成加、减、乘、除运算。
 * 学校中有教师和学生两类人，而在职研究生既是教师又是学生
 */
public class UserCompute {
    /**
     * 方法作用：用传递过来的对象调用computer()方法完成运算，并输出运算的结果。
     */
    public void userCom(Compute com,int one,int two){
        System.out.println("你计算的得数为"+com.compute(one,two));
    }
}
