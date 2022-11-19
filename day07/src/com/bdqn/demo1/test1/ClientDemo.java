package com.java.demo1.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        /*创建客户端对象*/
        try {
            Socket socket = new Socket("192.168.0.60", 8086);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            /*封装输出流对象*/
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String line;
            while ((line=br.readLine())!=null) {
                if (line.equals("886")) {
                    break;
                }
                /*输出流对象*/
//                socket.getOutputStream().write(line.getBytes());
                bw.write(line);
                bw.newLine();
                /*重新冲洗缓冲区*/
                bw.flush();

            }
            /*释放资源*/
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
