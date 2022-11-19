package com.job.demo2;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 7:25:49
 * @description 用户贷款类
 * 编写一个命名为UserLoan的程序，该程序使用命名为Loan的抽象类和多个子类，用来
 * 显示不同类型的贷款和每月的花费（家庭、汽车等项）。在每个具有合适属性的类中使用构造
 * 方法。添加获取和设置方法，其中抽象类至少有一个方法是抽象的。提示用户输入显示的类
 * 型，然后创建合适的对象。还要创建一个接口，该接口至少有一个用于子类的方法
 */
public class UserLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择你要贷款的类型：1：家庭 2：汽车");
        //接口实现
        ITheLoan idao = null;
        int type = input.nextInt();
        System.out.println("请选择你要贷款的金额：");
        double money = input.nextDouble();
        System.out.println("请输入你的贷款年限：1. 1年(12个月) 2. 3年(36个月) 3. 5年(60个月) " +
                "4. 20年(240个月)");
        int year = input.nextInt();
        switch (type) {
            case 1:
                idao = new Home(money, year);
                break;
            case 2:
                idao = new Car(money, year);
                break;
            default:
                break;
        }
        idao.showInfo();
    }
}
