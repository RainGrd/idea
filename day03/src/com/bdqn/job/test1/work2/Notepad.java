package com.bdqn.job.test1.work2;

import java.io.*;
import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 * 编写一个简易的记事本程序。包括：①显示记事本内容；②追加写入记事本内容；③记
 * 事本内容通过键盘输入完成。例如：
 * 输入：今天是个好天气
 * 在记事本中追加的内容：
 * 2020-12-24
 * 今天是个好天气
 */
public class Notepad {
    /*创建文本对象*/
    File file = new File("day03\\src\\com\\bdqn\\job\\test1\\work2\\demo.txt");
    /*创建文件输入流对象*/
    BufferedReader fis = null;
    FileWriter fw= null;
    FileReader fr=null;
    /*字节数组*/
    byte[] bytes = new byte[1024];
    /*创建一个文本字节输出流对象*/
    BufferedWriter bw = null;
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 17:06:15 2022/4/7
     * @param 
     * @return 
     * 方法描述：打印文件内容的方法
     **/
    public StringBuffer printText() {
        StringBuffer sb=new StringBuffer();
        try {
            fr=new FileReader(file);
            /*创建输入流对象*/
            fis = new BufferedReader(fr);
            int i = 0;
            String s="";
            /*写入数据*/
            while ((s = fis.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb;
    }

    /**
     * @param
     * @return 方法描述：打印添加后的数据
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 16:53:50 2022/4/7
     **/
    public void addStr(String str) {
        try {
            fw=new FileWriter(file, true);
            /*创建一个缓冲区写入字符流的对象*/
            bw = new BufferedWriter(fw);
            bw.newLine();
            /*换行*/
            for (int i = 0; i < str.length(); i++) {
                /*通过循环写入数据*/
                bw.write(str.charAt(i));
            }
            System.out.println("写入完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param
     * @return 方法描述：关闭连接的方法
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 16:54:56 2022/4/7
     **/
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        System.out.println("请选择你的选择选项");
        System.out.println("1.查看当前类的文本 2.添加文本内容 3.退出");
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        boolean flag=true;
        while (flag) {
            if(op==1){
                System.out.println("查看内容如下！");
                System.out.println(notepad.printText());
                System.out.println("1.查看当前类的文本 2.添加文本内容 3.退出");
                op=input.nextInt();
            }else if(op==2){
                System.out.println("请输入文本内容：");
                /*添加数据*/
                String str = input.next();
                notepad.addStr(str);
                System.out.println("1.查看当前类的文本 2.添加文本内容 3.退出");
                op=input.nextInt();
            }else if(op==3){
                System.out.println("退出");
                System.exit(0);
            }
            /*switch (op) {
                case 1:
                    System.out.println("查看内容如下！");
                    notepad.printText();
                    break;
                case 2:
                    System.out.println("请输入文本内容：");
                    *//*添加数据*//*
                    String str = input.nextLine();
                    notepad.addStr(str);
                    flag=false;
                    break;
                case 3:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    break;
            }*/

        }
    }
}
