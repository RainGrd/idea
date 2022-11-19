package com.bdqn.job.test3;

import java.io.File;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Test {
    public static void main(String[] args){
        /*定义DataSetReader*/
        DataSetReader reader = new DataSetReader();
        try {
            /*获取文件的相对路径*/
            reader.readFile("D:\\学习资料\\idea\\day02\\src\\com\\bdqn\\job\\test3\\demo.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (BadDataException e){
            System.out.println(e.getMessage());
        }finally{
            /*文件内容长度*/
            System.out.println(reader.getLength());
            /*遍历reader的data数组，进行输出*/
            double[] data=reader.getData();
            for(int i=0;i<reader.getLength();i++){
                System.out.println(data[i]);
            }
        }
    }
}
