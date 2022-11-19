package com.job.test2.circular;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/25 15:18:54
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择你要计算的图形：1.圆形 2.矩形 3.三角形");
        int n = input.nextInt();
        /*接口来定义类，这就是多态性的体现*/
        IShapeCompute s = null;
        switch (n) {
            case 1:
                s = new Circle(6, 2, 5);
                break;
            case 2:
                s = new Rectangle(6, 6);
                break;
            case 3:
                s=new Triangle(2,2,4,4,6);
                break;
            default:
                break;
        }
        /*显示输出*/
        s.display();
    }
}
