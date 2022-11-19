package com.bdqn.java1.demo5;

import java.io.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class BufferedWriterFunc {
    public static void main(String[] args) {
        /*在字符串数组中保存写入的数组*/
        String[] content = {"你好", "Java"};
        /*创建文件对象*/
        File file = new File("day03\\src\\com\\bdqn\\java1\\bfw.txt");
        /*文件输出流对象*/
        FileWriter fw = null;
        /*创建一个字符输出流对象*/
        BufferedWriter bw = null;
        /*创建缓存流输入流对象*/
        BufferedReader reader = null;
        /*创建文件输出流的对象*/
        FileReader fileReader = null;
        try {
            /*实例化对象*/
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            /*通过for循环遍历数组写入文件*/
            for (int i = 0; i < content.length; i++) {
                bw.write(content[i]);
                /*读取文件的输出流*/
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*读取bfw.txt的内容*/
        try {
            /*实例化对象*/
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            System.out.println("文件内容如下：");
            /*读取的是字符需要用字符串获取*/
            String line=null;
            /*通过while循环遍历获取内容*/
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*关闭连接，释放资源*/
            try {
                reader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
