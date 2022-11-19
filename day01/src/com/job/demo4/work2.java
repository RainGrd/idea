package com.job.demo4;

import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 15:00:27
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class work2 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        /*从命令行方式输入的字符串中删去所有重复的字符（即每种字符只保留一个）。例如，
        输入school，则删除后的字符串为schol。*/
        Scanner input = new Scanner(System.in);
        String str=input.next();
        /*将字符串转换为StringBuffer*/
        /*String tempStr="";
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            *//*临时变量赋值*//*
           temp = str.substring(i,i+1);
            if (tempStr.indexOf(temp)==-1) {
                tempStr=tempStr+temp;
            }

        }
        System.out.println("整理后的字符："+tempStr);*/
        /*将字符串转换成StringBuffer*/
        StringBuffer sb=new StringBuffer(str);
        /*利用双重循环进行判断*/
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i+1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                }
            }
        }
        System.out.println("整理完的字符串"+sb);
    }
}
