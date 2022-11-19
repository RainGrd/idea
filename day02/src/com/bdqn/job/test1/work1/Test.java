package com.bdqn.job.test1.work1;

import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 14:12:24
 * @description: 主方法
 * @version: 1.0
 * @param：
 * 根据交通信号灯颜色决定汽车状态。要求：
 * （1）将交通信号灯颜色和汽车状态定义为枚举类型。交通信号灯颜色包括RED、YELLOW
 * 和GREEN；汽车状态包括STOP、DRIVE和SLOWDOWN。
 * （2）使用switch语句实现根据交通信号灯颜色输出行人状态
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入交通灯的颜色(RED/GREEN/YELLOW)");
        Scanner input = new Scanner(System.in);
        Signal color=Signal.valueOf(input.next());
        /*默认急停*/
        Car car= new Car(Status.STOP);
        switch (color) {
            case RED:
                car.setStatus(Status.STOP);
                break;
            case GREEN:
                car.setStatus(Status.DRIVE);
                break;
            case YELLOW:
                car.setStatus(Status.SLOWDOWN);
                break;
            default:
                System.out.println("输入错误！");
                break;
        }
        /*输出汽车状态*/
        Status status = car.getStatus();
        System.out.println(status);
    }
}
