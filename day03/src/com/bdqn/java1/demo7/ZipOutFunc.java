package com.bdqn.java1.demo7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ZipOutFunc {
    public static void main(String[] args) {
        /*指定要压缩的文件：*/
        String fileName[] = {"day03\\src\\com\\bdqn\\java1\\demo7\\DiGuiDemo.java",
                "day03\\src\\com\\bdqn\\java1\\demo7\\Factorial.java",
                "day03\\src\\com\\bdqn\\java1\\demo7\\Directory.java"};
        /*创建文件输出流对象*/
        FileOutputStream fos = null;
        try {
            /*定义压缩文件输出流*/
            fos = new FileOutputStream("day03\\src\\com\\bdqn\\java1\\demo7\\test.zip");
            /*生成压缩文件对象,并利用缓存区对象进行读取*/
            ZipOutputStream zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
            /*循环压缩文件*/
            for (int i = 0; i < fileName.length; i++) {
                /*调用压缩文件方法*/
                System.out.println("Writing file" + fileName[i]);
                /*创建缓存文件流对象*/
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName[i]));
                /*设置zip对象*/
                zipOut.putNextEntry(new ZipEntry(fileName[i]));
                int b;
                while ((b = bis.read()) != -1) {
                    /*写入文件*/
                    zipOut.write(b);
                }
                /*关闭缓存文件流对象的连接*/
                bis.close();
            }
            /*关闭zip对象连接*/
            zipOut.close();
            System.out.println("写入完毕！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
