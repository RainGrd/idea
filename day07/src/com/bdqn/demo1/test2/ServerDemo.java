package com.java.demo1.test2;

import javax.sound.sampled.Line;
import java.io.*;
import java.net.ServerSocket;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            /*监听客户端的连接*/
            /*InputStream inputStream = serverSocket.accept().getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);*/
            BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            String line;
            BufferedWriter bw=new BufferedWriter(new FileWriter("day07\\test.txt"));
            StringBuffer buffer= new StringBuffer();
            while (((line=br.readLine())!=null)) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            /**/
            bw.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
