package com.bdqn.test4.demo2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Love implements ILove{

    @Override
    public void love(int a) {
        System.out.println("i love you-->"+a);
    }
}
