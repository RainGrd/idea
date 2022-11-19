package com.bdqn.java1.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class FileOutputStreamFunc {
    public static void main(String[] args) {
        /*声明FileInput/OutputStream对象fis/fos*/
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile=new File("day03\\src\\com\\bdqn\\java1\\demo2\\Demo.java");
            fis=new FileInputStream(srcFile);
            /*创建目标文件对象*/
            File targetFile = new File("day03\\src\\com\\bdqn\\java1\\demo2\\Demo.txt");
            fos=new FileOutputStream(targetFile);
            /*定义字节数组*/
            byte[] bytes = new byte[1024];
            int i=fis.read(bytes);
            /*通过while将Demo.java的内容读取到Demo.txt文件的之中*/
            while(i!=-1){
                /*写入数据*/
                fos.write(bytes,0,i);
                i=fis.read(bytes);
            }
            System.out.println("写入结束");
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                /*释放资源*/
                fis.close();
                fos.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
