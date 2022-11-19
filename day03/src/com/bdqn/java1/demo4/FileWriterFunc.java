package com.bdqn.java1.demo4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class FileWriterFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileWriter fw=null;
        try{
            fw=new FileWriter("day03\\src\\com\\bdqn\\java1\\demo2\\Demo.txt");
            for (int i=0; i<4;i++){
                System.out.println("请输入第"+(i+1)+"个字符串：");
                String name=input.nextLine();
                /*循环写入文件*/
                fw.write(name+"\r\n");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            /*关闭连接，释放资源*/
            try {
                fw.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
