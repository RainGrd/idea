package com.bdqn.java1.demo4;

import java.io.FileReader;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：字符流测试
 */
public class FileReaderFunc {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader=new FileReader("day03\\src\\com\\bdqn\\java1\\demo2\\Demo.java");
            int i=0;
            System.out.println("文件内容如下：");
            while((i=reader.read())!=-1){
                /*通过char转换为字符*/
                System.out.print((char)i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            /*关闭连接，释放资源*/
            try {
                reader.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
