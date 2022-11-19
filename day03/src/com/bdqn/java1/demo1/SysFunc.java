package com.bdqn.java1.demo1;

import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 通过System.in读取字节数组
 */
public class SysFunc {
    public static void main(String[] args) {
        byte[] byteData = new byte[1024];
        System.out.println("请输入英文：");
        int len=0;
        try {
            len=System.in.read(byteData);
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的内容：");
        for (int i = 0; i < len; i++) {
            System.out.println((char) byteData[i]);
        }
    }
}
