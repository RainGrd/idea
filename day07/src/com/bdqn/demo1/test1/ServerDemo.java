package com.java.demo1.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            ServerSocket serverSocket = new ServerSocket(8086);
            /*监听客户端的连接*/
            /*InputStream inputStream = serverSocket.accept().getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);*/
            BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            String line;
            while ((line=br.readLine())!=null) {
                StringBuffer buffer= new StringBuffer();
                buffer.append(line);
                System.out.println(buffer);
            }
            /*释放资源*/
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
