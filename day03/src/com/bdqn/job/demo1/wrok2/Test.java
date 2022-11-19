package com.bdqn.job.demo1.wrok2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：编写应用程序，创建BufferedReader的对象，从某个文本文件中的字符输入数据流中读
 * 取一行字符（该文件与程序在同一目录下），跳过10个字节后将其显示出来。
 */
public class Test {
    public static void main(String[] args) {
        /*指定文件路径*/
        File file=new File("day03\\src\\com\\bdqn\\job\\demo1\\wrok2\\demo.txt");
        /*创建文件读取对象*/
        FileReader fr=null;
        /*创建BufferedReader对象*/
        BufferedReader fis=null;
        try {
            /*实例化对象*/
            fr=new FileReader(file);
            fis=new BufferedReader(fr);
            /*用于接收读取的字符*/
            String str="";
            /*跳过10个字节*/
            fr.skip(10);
            /*通过while循环遍历获取数据*/
            System.out.println("文件内容如下：");
            while ((str=fis.readLine())!=null){
                System.out.print(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            /*关闭连接，释放资源*/
            try{
                fis.close();
                fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
