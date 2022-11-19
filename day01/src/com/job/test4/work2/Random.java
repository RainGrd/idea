package com.job.test4.work2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 14:20:10
 * @description
 * 使用任意一种生成随机数的方法，随机产生三个两位的整数，经过比较后输出三个数中
 * 最大的那个数。
 */
public class Random {
    /**
     *
     *方法作用:产生随机数
     */
    public int randomNumber(){
        int number= (int) (Math.random()*100);
        /*防止出现个位数*/
        if (number <10) {
            number=10;
        }
        return number;
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("产生三个随机数");
        int number[]=new int[3];
        int max=0;
        for (int i = 0; i < number.length; i++) {
            number[i]=random.randomNumber();
            /*输出随机数*/
            System.out.println(number[i]);
            /*判断最大的那个数*/
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println("最大的那个数"+max);
    }
}
