package com.bdqn.test4.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestLambda2 {
    public static void main(String[] args) {
        ILove love=new Love();
        love.love(2);
        /*用lambda表达式简化代码*/
        ILove love1=(int a)->{
            System.out.println("i love you-->"+a);
        };
        /*简化1：简化代码参数类型
        love1=(a)->{
            System.out.println("i love you-->"+a);
        };
        简化2：简化括号
        love1=a->{
            System.out.println("i love you-->"+a);
        };*/
        /*简化3：去掉花括号*/
        love1=a->System.out.println("i love you-->"+a);
//        love1.love(520);
        love1.love(521);
    }
}
