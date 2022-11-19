package com.bdqn.java1.demo5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class BufferedReaderFunc {
    public static void main(String[] args) {
        /*文件*/
        FileReader f = null;
        /*缓存流*/
        BufferedReader reader = null;
        try {
            /*实例化对象*/
            f=new FileReader("day03\\src\\com\\bdqn\\java1\\bf.txt");
            reader=new BufferedReader(f);
            /*读取文件*/
            System.out.println("文件内容如下：");
            String line="";
            /*while循环遍历读取每行数据*/
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            /*关闭连接，释放资源*/
            try {
                f.close();
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        /**/
    }
}
