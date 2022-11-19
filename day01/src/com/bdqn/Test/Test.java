package com.bdqn.Test;

/**
 * @author: 段荣贵
 */
public class Test {
    public static void main(String[] args) {
//        String str1="小红";
//        String str2="小红"; //str2并没有单独占用内存，反而是与str1共同占用一个对象
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
        String str3=new String("钢精");
        String str4=new String("钢精");
        /*由于双等于号中是判断内存地址是否一致，而new String()会创建一个String的对象，
        而不是一个String类型的变量*/
        System.out.println(str3==str4); //false
        /*字符串的equals方法是被重写的，他这里面只是判断了两个字符串的内容是否一致*/
        System.out.println(str3.equals(str4));  //true
        //注意事项
        /*字符串的判断必须要用equals方法判断内容*/

    }
}
