package com.bdqn.test4.demo1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 * 推导lambda表达式
 */
public class TestLambda1 {

    public static void main(String[] args) {
        ILike like=new Like();
        like.lambda();
        /*用lambda表达式来写函数式接口*/
        like=()->{
            System.out.println("i like lambda like");
        };
        like.lambda();
    }

}

