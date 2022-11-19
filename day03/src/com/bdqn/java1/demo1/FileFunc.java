package com.bdqn.java1.demo1;

import java.io.File;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class FileFunc {
    public static void main(String[] args) {
        /*创建一个文件对象*/
        File file = new File("学习资料"+"Java"+"demo.txt");
        /*重新创建文件*/
        try {
            /*删除文件*/
            if(file.exists()) {
                file.delete();
            }
            file.createNewFile();
            System.out.println("创建文件成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
