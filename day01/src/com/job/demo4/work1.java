package com.job.demo4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 14:31:15
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class work1 {
    public static void main(String[] args) {
        /*判断以b开头的正则*/
        Pattern p1 = Pattern.compile("^b.*");
        /*设定5个字符串并只打印那些以字母b开头的字符串。*/
        String str[]={"abc","bac","cab","bca","acb"};
        System.out.println("设定5个字符串并只打印那些以字母b开头的字符串");
        for (int i = 0; i < str.length; i++){
            Matcher matcher = p1.matcher(str[i]);
            if (matcher.matches()) {
                System.out.println(str[i]);
            }else{
                continue;
            }
        }
        /*设定5个字符串并只打印那些以字母CH结尾的字符串。*/
        Pattern p2=Pattern.compile(".*[CH]$");
        System.out.println("设定5个字符串并只打印那些以字母CH结尾的字符串");
        String str2[]={"adfCh","sdf","oiuCH","uio","LKJCH"};
        for (int i = 0; i < str2.length; i++){
            Matcher matcher = p2.matcher(str2[i]);
            if (matcher.matches()) {
                System.out.println(str2[i]);
            }else {
                continue;
            }
        }
    }
}
