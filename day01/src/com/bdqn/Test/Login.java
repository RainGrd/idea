package com.bdqn.Test;

import java.util.Scanner;

/**
 * @author: 段荣贵
 */
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName="admin";
        String password = "123";
        System.out.println("请输入用户名");
        String name = input.next();
        System.out.println("请输入密码：");
        String pwd=input.next();
        //判断
        if(name.equals(userName) && pwd.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
