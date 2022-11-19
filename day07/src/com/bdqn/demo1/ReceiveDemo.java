package com.java.demo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReceiveDemo {
    public static void main(String[] args) {
        try {
            /*创建对象*/
            DatagramSocket socket = new DatagramSocket(20056);
            while (true) {
                /*打包数据*/
                byte[] bytes =new byte[1024];
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
                /*接收数据*/
                socket.receive(packet);
                /*解析数据包*/
                byte[] data = packet.getData();
                int length = packet.getLength();
                System.out.println(new String(data,0,length));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
