package com.bdqn.java1.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：利用FileInputStream读出指定目录下得指定文件中的内容
 */
public class FileInputStreamFunc {
    public static void main(String[] args) {
        File f=new File("day03\\src\\com\\bdqn\\java1\\demo2\\Demo.java");
        FileInputStream fis=null;
        try {
            /*因为File没有读写的功能，所以需要有InputStream*/
            fis=new FileInputStream(f);
            /*定义一个字节数组*/
            byte[] bytes=new byte[1024];
            int n=0;
            System.out.println("文件内容如下:");
            /*判断是否符合条件*/
            while((n=fis.read(bytes))!=-1){
                /*读取文件内容*/
                String s=new String(bytes,0,n);
                /*输出*/
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                /*关闭连接，释放资源*/
                fis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
