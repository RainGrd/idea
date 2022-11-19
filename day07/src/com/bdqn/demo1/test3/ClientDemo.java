package com.java.demo1.test3;

import java.io.*;
import java.net.Socket;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.60", 10000);
            /*读取文本文件的数据*/
            BufferedReader reader = new BufferedReader(new FileReader("D:\\学习资料\\idea\\day07\\Test.java"));
            /*写入输出流对象*/
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
            socket.shutdownOutput();
            /*接收反馈*/
            BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = bfr.readLine();
            System.out.println("服务器的反馈："+s);
            /*释放资源*/
            reader.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
