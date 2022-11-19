package com.bdqn.java1.demo2;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ByteOutputStreamFunc {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        /*创建字节数组*/
        byte[]b={1,-1,25,-22,-5,23};
        out.write(b,0,6);
        /*输出字节数*/
        System.out.println("数组中一共包含:"+out.size()+"字节");
        /*将输出流的当前内装换成字节数组*/
        byte[]b2=out.toByteArray();
        /*输出数组中的内容*/
        System.out.println(Arrays.toString(b2));

    }
}
