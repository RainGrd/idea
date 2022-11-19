package com.java.demo1.test3;

import jdk.net.Sockets;

import java.io.*;
import java.net.Socket;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ServerThread implements Runnable {
    Socket s;
    @Override
    public void run() {
        /*接收数据写到文本文件*/
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("day07\\Copy.java"));
            /*解决名称*/
            int count=0;
            File file = new File("day07\\Copy["+count+"].java");
            while (file.exists()) {
                count++;
                file = new File("day07\\Copy["+count+"].java");
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String line;
            while((line= reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
            /*给出反馈*/
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("文件上传成功");
            bw.newLine();
            bw.flush();
            /*释放资源*/
            reader.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ServerThread(Socket s) {
        this.s = s;
    }
}
