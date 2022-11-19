package com.bdqn.java1.demo8;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ZipInFunc {
    public static void main(String[] args) {
        System.out.println("开始解压缩：");
        FileInputStream fis=null;
        ZipInputStream zis=null;
        ZipEntry ze;
        BufferedWriter BufferedWriter=null;
        FileWriter fileWriter=null;
        File file = new File("day03\\src\\com\\bdqn\\java1\\demo8\\test.zip");
        try {
            /*实例化对象,指定压缩包路径*/
            fis=new FileInputStream("day03\\src\\com\\bdqn\\java1\\demo8\\test.zip");
            zis=new ZipInputStream(new BufferedInputStream(fis));
            /*遍历循环*/
            while ((ze=zis.getNextEntry())!=null){
                /*获取文件名*/
                System.out.println("处理文件："+ze.getName());
                /*获取文件的路径名*/
                File srcFile=new File(ze.getName());
                System.out.println(srcFile);
                /*输出的文件对象*/
                File dstFile=new File(srcFile.getParent(),srcFile.getName());
                fileWriter=new FileWriter(dstFile);
                /*开始读取数据*/
                BufferedWriter=new BufferedWriter(fileWriter);
                int len;
                while ((len=zis.read())!=-1){
                    /*将文件把内容写入System中*/
                    System.out.write(len);
                    /*写入数据*/
                    BufferedWriter.write(len);
                }
                /*关闭连接*/
                BufferedWriter.close();
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            /*关闭输入流对象*/
            try {
                zis.close();
            }catch(Exception e){

            }
        }
    }
}
