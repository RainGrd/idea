package com.bdqn.job.test1.work1;

import java.io.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：从文件中读入一段英文短文，将此短文中连续的两个或多个空格删除，只保留一个空格，
 * 通过这样规范英文短文格式，将修改后的短文写入一个文本文件中，并输出到屏幕上。
 */
public class Test {
    public static void main(String[] args) {
        /*指定文件路径*/
        File file = new File("day03\\src\\com\\bdqn\\job\\test1\\work1\\demo.txt");
        /*创建文件读取对象*/
        FileInputStream fis = null;
        /*创建文件输出对象*/
        FileOutputStream fos = null;

        try {
            /*获取要解码的字节长度*/
            int space = (int) (' '), i;
            /*实例化对象*/
            fis = new FileInputStream(file);
            fos = new FileOutputStream(new File("day03\\src\\com\\bdqn\\job\\test1\\work1\\test.txt"));
            /*通过while获取数据传输到test.txt文件中*/
            System.out.println("格式化的文件内容如下:");
            while ((i = fis.read()) != -1) {
                /*判断*/
                if (i == ' ' && space == ' ') {
                    /*跳过*/
                    continue;
                } else {
                    /*指定写入的字节*/
                    fos.write(i);
                    System.out.print((char) i);
                    /*重新进行遍历*/
                    i = space;
                }

            }
            System.out.println("写入文件完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /*释放资源*/
            try {
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
