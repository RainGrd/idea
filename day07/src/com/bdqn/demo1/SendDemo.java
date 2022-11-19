package com.java.demo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class SendDemo {
    public static void main(String[] args) {
        try {
            /*创建对象*/
            DatagramSocket socket = new DatagramSocket();
            /*封装键盘录入数据*/
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line=br.readLine())!=null) {
                /*输入的数据是886，发送数据结束*/
                if("886".equals(line)){
                    break;
                }else{
                    /*打包数据*/
                    byte[] bytes = line.getBytes();
                    DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.0.60"),20056);
                    /*发送数据*/
                    socket.send(packet);
                }
            }
            /*关闭数据*/
            br.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
