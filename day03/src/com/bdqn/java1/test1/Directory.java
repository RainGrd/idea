package com.bdqn.java1.test1;

import java.io.File;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：通过递归遍历目录
 */
public class Directory {
    public static void main(String[] args) {

        /*文件目录路径*/
        String path="D:\\学习资料\\Java";
        File file = new File(path);
        /*调用这个方法*/
        getAllFile(file);
    }
    /**
     * @author 段荣贵
     * @description //TODO
     * @date 16:23:41 2022/4/6
     * @param 
     * @return 
     * 方法描述：获取既定目录下的所有内容，参数为第一步创建的File对象
     **/
    public static void getAllFile(File f){
        /*获取File目录下的File数组*/
        File[] files = f.listFiles();
        /*遍历files得到每一个File对象*/
        if(files!=null){
            for (File file : files) {
                /*判断该File对象是不是目录*/
                if(file.isDirectory()){
                    /*调用递归*/
                    getAllFile(file);
                }else{
                    /*输出该目录下文件的的路径*/
                    System.out.println(file);
                }
            }
        }

    }
}
