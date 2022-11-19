package com.job.test2.theme;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 10:19:59
 * @description 主方法
 */
public class Test {
    public static void main(String[] args) {
        /*1.初始化数据*/
        Phone phone = new Phone("清新");
        /*显示默认的主题*/
        System.out.println("默认主题：" + phone.getTheme());
        /*2.设置是否更换主题*/
        Scanner input = new Scanner(System.in);
        System.out.println("是否更换主题 (0.取消 1.更换)");
        int number = input.nextInt();
        switch (number) {
            case 0:
                System.out.println("你已取消");
                break;
            case 1:
                System.out.println("请输入要更换主题的名称：");
                String type = input.next();
                phone.setTheme(type);
                /*3.打印输出主题*/
                System.out.println("更换后的主题：" + phone.getTheme());
                break;
            default:
                System.out.println("输入错误");
                break;
        }

    }
}
