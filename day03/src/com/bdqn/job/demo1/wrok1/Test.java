package com.bdqn.job.demo1.wrok1;

import java.io.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：创建目录C:\temp，并创建一个文件2.txt，向该文件中写入字符串“welcome to java
 * world.”共5次。
 */
public class Test {
    public static void main(String[] args) {
        String str="welcome to java world";
        /*指定文件路径*/
        File file=new File("day03\\src\\com\\bdqn\\job\\demo1\\temp\\demo.txt");
        /*创建文件读取对象*/
        FileWriter fr = null;
        /*创建缓存流对象*/
        BufferedWriter reader=null;
        try {
            /*实例化对象*/
            fr=new FileWriter(file);
            reader=new BufferedWriter(fr);
            /*通过循环遍历str将数据传输到文件中*/
            for(int i=0; i<str.length(); i++){
                /*将读取的字符转成char的格式即可*/
                fr.write(str.charAt(i));
                /*换行*/
                reader.newLine();
            }
            System.out.println("读取文件完毕!");
        }
        catch (IOException e){
         e.printStackTrace();
        }finally{
            /*释放资源*/
            try {
                reader.close();
                fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
