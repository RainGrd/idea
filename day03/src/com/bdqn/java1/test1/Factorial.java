package com.bdqn.java1.test1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：用递归求5的阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        /*调用方法*/
        int  result=jc(5);
        /*输出结果*/
        System.out.println(result);
    }
    /**
     * @author 段荣贵
     * @description //TODO
     * @date 16:15:32 2022/4/6
     * @param n 阶乘参数
     * @return
     * 定义一个方法，用于递归求阶乘，参数为一个int类型的变量
     **/
    public static int jc(int n){
        if(n==1){
            return n;
        }else{
            return n*jc(n-1);
        }
    }
}
