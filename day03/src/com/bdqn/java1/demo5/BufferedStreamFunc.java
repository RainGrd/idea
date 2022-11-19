package com.bdqn.java1.demo5;

import java.io.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class BufferedStreamFunc {
    public static void main(String[] args) {
        String[] data={"你好","Java","欢迎","编程"};
        File file = new File("day03\\src\\com\\bdqn\\java1\\bf.txt");
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        try {
            fos=new FileOutputStream(file);
            /*缓存流输入流，从文件读取数据到磁盘*/
            bos=new BufferedOutputStream(fos);
            /*定义字节数组*/
            byte bytes[]=new byte[1024];
            for (int i = 0; i < data.length; i++) {
                /*添加数据*/
                bytes=data[i].getBytes();
                bos.write(bytes);
            }
            System.out.println("写入文件完毕！");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        try{
            fis=new FileInputStream(file);
            /*从磁盘读取数据到控制台*/
            bis=new BufferedInputStream(fis);
            /*字节流*/
            byte[] buffer=new byte[1024];
            int len=bis.read(buffer);
            /*从零开始遍历buffer*/
            System.out.println("bf.txt文件中的数据为："+new String(buffer,0,len));
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fis.close();
                bis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
