package com.bdqn.job.test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class DataSetReader {
    /*定义数据数组和长度*/
    private double [] data;

    
    private int length;
    /**
     * @author 段荣贵
     * @description //TODO
     * @date 10:30:48 2022/4/7
     * @param 
     * @return 
     * 方法描述：获取长度
     **/
    public int getLength() {
        return this.length;
    }

    /**
     * @author 段荣贵
     * @description //初始化数据
     * @date 11:31:34 2022/4/6
     **/
    public DataSetReader() {
        this.data = new double[20];
        this.length = 0;
    }

    /**
     * @author 段荣贵
     * @description //TODO 
     * @date 10:25:11 2022/4/6
     * @param fileName 文件内容
     * @return
     * readFile()用来打开文件并将读取的数据存储在数组data中。如果读取的数据不是double
     * 型数据时，使用throw抛出BadDataException异常。
     **/
    public void readFile(String fileName) throws IOException ,BadDataException{
        /*创建文件类,获取文件路径*/
        File file = new File(fileName);
        /*缓冲字符区输入流*/
        BufferedReader reader = new BufferedReader(new FileReader(file));
        /*行数*/
        int line=0;
        /*读取行数*/
        String lineStr="";
        /*读取数据*/
        while ((lineStr=reader.readLine())!=null){
            line++;
            /*判断读取的数据是不是小数*/
            String pattern="^[1-9]\\\\d*\\\\.\\\\d*|0\\.\\\\d*[1-9]\\\\d*$";
            if(!lineStr.matches(pattern)){
                /*储存进入数组*/
                this.data[this.length]=Double.parseDouble(lineStr);
                this.length++;
            }else{
                /*如果不是小数，则抛出异常*/
                throw new BadDataException(line);
            }
        }
    }
    public double[] getData() {
        return data;
    }
}
