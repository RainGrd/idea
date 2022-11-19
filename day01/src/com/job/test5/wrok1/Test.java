package com.job.test5.wrok1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 16:51:24
 * @description: 主方法
 * @version: 1.0
 * @param：
 * 具体要求如下。
 * （1）定义Text类，并从键盘上输入一篇文章（以#行为结束）。
 * （2）统计该文章中共有多少个单词。
 * （3）定义测试类，实现定义的功能
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入文章：(以#符号结束)");
        Scanner input = new Scanner(System.in);
        String str=input.next();
        /*输出换行*/
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                break;
            }
            System.out.print(str.charAt(i));
        }
        Text text = new Text(str);
        System.out.println("\n文章里面的单词一共有:"+text.countWords());
        /*返回位置*/
        System.out.println("这个字符串第一次出现的位置:"+text.find("drg",6));
        /*替换字符*/
        text.replaceAll("drg","zh");
    }
    /**
     *方法作用：判断字符是否以#结束
     */
    public boolean finish(String str){
        Pattern pattern = Pattern.compile(".*\\#");
        Matcher matcher = pattern.matcher(str);
        /**/
        return matcher.matches();
    }
}
