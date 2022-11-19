package com.bdqn.java1.demo2;

import java.io.ByteArrayInputStream;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ByteInputStreamFunc {
    public static void main(String[] args) {
        /*创建数组*/
        byte[] b={1,-1,25,-22,-5,23};
        /*创建字节数组输入流*/
        ByteArrayInputStream in = new ByteArrayInputStream(b,0,6);
        /*读取字节，转换为int型数据*/
        int i=in.read();
        /*如果不返回-1，则表示没有到输入流的末尾，继承循环*/
        while(i!=-1){
            /*i转换为byte使用来获取原来的byte数据*/
            System.out.println("原值="+(byte)i+"\t\t转换成int型="+i);
            /*读取下一个*/
            i=in.read();
        }
    }
}
