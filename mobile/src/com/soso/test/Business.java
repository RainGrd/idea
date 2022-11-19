package com.soso.test;

import com.soso.entity.*;
import com.soso.tools.CardUtil;

import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：业务类
 */
public class Business {
    /*注册的卡号,序号*/
    int number, serialNum;
    /*姓名,注册的新密码,*/
    String userName, userPwd;
    /*预存话费金额*/
    double price;
    /*服务类*/
    BaseServicePackage servicePackage = null;
    Scanner input = new Scanner(System.in);
    /*业务类对象*/
    static Business business = new Business();
    /*手机号*/
    String phone = "";
    /*密码*/
    String password = "";

    public static void main(String[] args) {
        business.hall();
    }
    /**
     * @param
     * @return
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:47:09 2022/4/13
     * 方法描述：业务大厅主菜单
     **/
    public void hall() {
        /*循环判断条件*/
        int index = 0;
        /*模块*/
        String module = "";
        /*初始化用户和使用场景*/
        CardUtil.initUser();
        CardUtil.initScene();
        do {
            System.out.println("********************欢迎使用嗖嗖移动大厅********************");
            System.out.println("1.用户登录 2.用户注册 3.使用嗖嗖 4.话费充值 5.资费说明 6.退出系统");
            System.out.println("请选择业务模块：");
            module = input.next();
            switch (module) {
                case "1":
                    /*用户登录*/
                    System.out.println("请输入手机卡号");
                    phone = input.next();
                    System.out.println("请输入密码：");
                    password = input.next();
                    while (!CardUtil.isExistCard(phone, password)) {
                        System.out.println("卡号或密码输入错误！请重新输入卡号：");
                        phone = input.next();
                        System.out.println("请重新输入密码：");
                        password = input.next();
                    }
                    System.out.println("登录成功！");
                    /*二级菜单*/
                    menu();
                    break;
                case "2":
                    /*用户注册*/
                    registeredCard();
                    break;
                case "3":
                    /*使用嗖嗖*/
                    System.out.println("请输入手机卡号");
                    phone = input.next();
                    while (!CardUtil.isExistCard(phone)) {
                        System.out.println("没有此手机号码！请重新输入");
                        phone = input.next();
                    }
                    CardUtil.useSoSo(phone);
                    break;
                case "4":
                    /*话费充值*/
                    CardUtil.changeMoney();
                    break;
                case "5":
                    /*资费说明*/
                    System.out.println("*****资费说明******");
                    CardUtil.showDescription();
                    break;
                case "6":
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("没有此模块！请重新选择业务模块：");
                    break;
            }
        } while (index == 0);
    }

    /**
     * @param
     * @return 方法描述：二级菜单
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 7:26:00 2022/4/14
     **/
    public void menu() {
        int count = 0;
        do {
            System.out.println("**********嗖嗖移动用户菜单**********");
            System.out.println("1.本月账单查询\n2.套餐余量查询\n3.打印消费详单\n4.套餐变更\n5.办理退网");
            System.out.println("请选择(输入1~5选择功能，其他键返回上一级)");
            count = input.nextInt();
            switch (count) {
                case 1:
                    /*本月账单查询*/
                    System.out.println("******本月账单查询******");
                    CardUtil.showAmountDetail(phone);
                    break;
                case 2:
                    /*本月套餐余量查询*/
                    System.out.println("******套餐余量查询******");
                    CardUtil.showRemainDetail(phone);
                    break;
                case 3:
                    /*消费清单查询*/
                    System.out.println("******消费清单查询******");
                    CardUtil.printConSumInfo(phone);
                    break;
                case 4:
                    /*套餐变更*/
                    System.out.println("******套餐变更******");
                    System.out.println("1.话痨套餐 2.网虫套餐 3.超人套餐 请选择(序号)：");
                    String packNum = input.next();
                    CardUtil.changingPack(phone, packNum);
                    break;
                case 5:
                    /*办理退网*/
                    System.out.println("******办理退网******");
                    CardUtil.delCard(phone);
                    /*返回上一级菜单*/
                    business.hall();
                    break;
                default:
                    /*返回上一级菜单*/
                    business.hall();
                    break;
            }
        } while (true);
    }

    /**
     * @param
     * @return 方法描述：用户注册
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 15:13:13 2022/4/14
     **/
    public void registeredCard() {
        System.out.print("****可选择的卡号****");
        String[] numbers = CardUtil.getNewNumbers(9);
        for (int j = 0; j < numbers.length; j++) {
            /*换行*/
            if (j % 3 == 0) {
                System.out.println();
            }
            /*输出卡号*/
            System.out.print((j + 1) + "." + numbers[j] + "\t\t");
        }
        System.out.println("\n请选择卡号：(1~9的序号)");
        number = input.nextInt();
        while (number >= numbers.length+1 || number <= 0) {
            System.out.println("没有此序号，请重新输入：");
            number = input.nextInt();
        }
        /*选择套餐*/
        System.out.println("1.话痨套餐 2.网虫套餐 3.超人套餐，请选择套餐(输入序号)：");
        serialNum = input.nextInt();
        servicePackage = CardUtil.createPack(serialNum);
        while (servicePackage == null) {
            System.out.println("输入错误！请重新输入！");
            serialNum = input.nextInt();
        }
        System.out.println("请输入姓名：");
        userName = input.next();
        System.out.println("请输入密码：");
        userPwd = input.next();
        System.out.println("请输入预存话费金额：");
        price = input.nextDouble();
        while (price > 500) {
            System.out.println("你预存的话费金额不能大于500元：请重新输入：");
            price = input.nextDouble();
        }
        /*判断预存话费金额是否满足条件*/
        while (price < servicePackage.getPrice()) {
            System.out.println("你预存的话费金额不足以支付本月固定套餐资费"+servicePackage.getPrice()+"元,请重新输入：");
            price = input.nextDouble();
        }
        System.out.println("注册成功！卡号：" + numbers[--number] + " 用户名：" + userName + " 当前余额：" +(price-servicePackage.getPrice()));
        number++;
        /*添加新卡*/
        CardUtil.addCard(new MobileCard(userName, numbers[--number], userPwd, servicePackage, servicePackage.getPrice(), price - servicePackage.getPrice()));
        /*显示注册的卡号套餐信息*/
        servicePackage.showInfo();
    }
}
