package com.bdqn.job.test1.work3;

import java.io.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：将某个TXT文件的复制到这个目录下
 */
public class Test {
    static StringBuffer sb=new StringBuffer();
    /**
     * @param
     * @return 方法描述：
     * 1.读取TXT的内容
     * 2.获取这个文本文件的名称
     * 3.在指定创建目录下创建一个相同名字的文件
     * 4.写入内容
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 8:42:45 2022/4/10
     **/
    public static void main(String[] args) {
        /*创建读取的文件路径*/
        File file = new File("day03\\src\\com\\bdqn\\job\\test1\\work2\\demo.txt");
        /*写入文件*/
        write(file.getName(),read(file));
    }

    /**
     * @param
     * @return 方法描述：读取文本内容
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 8:44:32 2022/4/10
     **/
    public static StringBuffer read(File file) {
        /*创建一个读取的文件字符流对象*/
        FileReader fr = null;
        String str ="";
        /*创建缓存流对象*/
        BufferedReader reader=null;
        try {
            /*实例化字符流对象*/
            fr = new FileReader(file);
            reader=new BufferedReader(fr);
            /*读取文件内容*/
            while ((str=reader.readLine())!=null){
                sb.append(str);
                sb.append("\n");
            }
        } catch (IOException e) {
            System.out.println("读取异常");
            e.printStackTrace();
        }finally{
            /*关闭连接*/
            try {
                reader.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb;
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 9:10:52 2022/4/10
     * @param
     * @return
     * 方法描述：写入文件
     **/
    public static void write(String newName,StringBuffer sb ){
        /*创建文件对象*/
        File file= new File("day03\\src\\com\\bdqn\\job\\test1\\work3\\"+newName);
        /*写入文件*/
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(file);
            /*创建文件*/
            bw=new BufferedWriter(fw);
            for (int i=0; i<sb.length(); i++) {
                /*写入内容*/
                bw.write(sb.charAt(i));
            }
            /*进行换行*/
            bw.newLine();
            System.out.println("复制成功！");
            /*输出被打印的内容*/
            System.out.println("复制后内容:"+read(file));
        }catch(IOException e){
            System.out.println("复制失败！");
            e.printStackTrace();
        }finally {
            /*关闭连接，释放资源*/
            try {
                bw.close();
                fw.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
