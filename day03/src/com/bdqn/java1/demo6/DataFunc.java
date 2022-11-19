package com.bdqn.java1.demo6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：描述主方法
 */
public class DataFunc {
    public static void main(String[] args) {
        /*创建文件输出流和输入流的对象*/
        FileInputStream fis=null;
        FileOutputStream fos=null;
        DataInputStream dis=null;
        DataOutputStream dos=null;
        try{
            int num1=100;
            char c1='J';
            double d1=3.14;
            String info1="Hello World";
            boolean good1=true;
            /*实例化对象*/
            fos=new FileOutputStream("data.bat");
            dos=new DataOutputStream(fos);
            /*输出到文件*/
            dos.writeInt(num1);
            dos.writeChar(c1);
            dos.writeDouble(d1);
            dos.writeUTF(info1);
            dos.writeBoolean(good1);
            /*实例化文件输入流对象*/
            fis=new FileInputStream("data.bat");
            dis=new DataInputStream(fis);
            /*输入到文件*/
            int num2=dis.readInt();
            char c2=dis.readChar();
            double d2=dis.readDouble();
            String info2=dis.readUTF();
            boolean good2=dis.readBoolean();
            /*读取文件,输出到控制台*/
            System.out.println(num2);
            System.out.println(c2);
            System.out.println(d2);
            System.out.println(info2);
            System.out.println(good2);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            /*关闭连接，释放资源*/
            try{
                dis.close();
                dos.close();
                fis.close();
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
