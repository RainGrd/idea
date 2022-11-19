package com.job.test5.work2;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 20:14:55
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎来到注册页面！");
        System.out.println("请输入你的密码：");
        Scanner input = new Scanner(System.in);
        String password=input.next();
        String str=null;
        while (!Validate.pwdLengt(password)) {
            System.out.println("密码长度不符合要求！请在输入一次密码：");
            password = input.next();
        }
        System.out.println("请确认密码：");
        String rPwd=input.next();
        while (!Validate.isPwd(password,rPwd)) {
            System.out.println("与原密码不一致！请重新输入！");
            rPwd = input.next();
        }
        System.out.println("请输入你的生日(请将你的月减一)：");
        String birthDay=input.next();
        while (!Validate.isBirthDay(birthDay)){
            System.out.println("生日格式错误：请重新输入！");
            birthDay = input.next();
        }
        System.out.println("请输入手机号码：");
        String phone=input.next();
        while (!Validate.judgePhone(phone)) {
            System.out.println("手机号码格式错误！请重新输入");
            phone = input.next();
        }
        System.out.println("请输入你的电子邮箱：");
        String mail=input.next();
        while (!Validate.mailValidate(mail)){
            System.out.println("邮箱格式错误！请重新输入：");
            mail = input.next();
        }
        System.out.println("请输入你的身份证号码：");
        String idNumber=input.next();
        while (!Validate.judgeIdNumber(idNumber)) {
            System.out.println("身份证号码格式错误：请重新输入：");
            idNumber = input.next();
        }
        System.out.println("请输入你的出生日期：");
        String data=input.next();
        while (!Validate.judgeData(data)) {
            System.out.println("你的出生日期格式错误，请重新输入：");
            data=input.next();
        }
        System.out.println("注册成功！！！");
    }

}
