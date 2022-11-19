package com.job.demo1;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 19:40:02
 * @description 测试汽车类
 */
public class TestCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要租用汽车的规格：");
        String size = input.next();
        //创建电话类
        Phone phone = new Phone(size);
        //订单金额
        System.out.println("请输入你的租用天数：");
        int day=input.nextInt();
        System.out.println("你租用的汽车规格："+phone.getSize());
        System.out.println("你的电话号码为："+phone.getPhone());
        System.out.println("你的租金为："+phone.calRent(day));
    }
}
