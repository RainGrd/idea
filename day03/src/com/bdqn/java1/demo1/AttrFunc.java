package com.bdqn.java1.demo1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：用File类获取文件属性
 */
public class AttrFunc {
    public static void main(String[] args) throws IOException {
        String path = "D:\\学习资料\\Java";
        /*创建一个File变量，并创建一个文档文档*/
        File f1 = new File(path, "demo.txt");
        /*获取父级路径*/
        String parent=f1.getParent();
        System.out.println(parent);
        File f2=new File(parent,"demo.txt");
        /*测试文件类的*/
        System.out.println("文件信息如下：");
        System.out.println("文件长度:" + f1.length() + "字节");
        System.out.println("文件或目录: " + (f1.isFile() ? "是文件" : "不是文件"));
        System.out.println("文件或目录: " + (f1.isDirectory() ? "是目录" : "不是目录"));
        System.out.println("是否可读：" + (f1.canRead() ? "可读取" : "不可读取"));
        System.out.println("是否可写：" + ((f1.canWrite()) ? "可写入" : "不可写入"));
        System.out.println("是否隐藏:" + (f1.isHidden() ? "是隐藏文件" : "隐藏文件"));
        System.out.println("最后修改日期：" + new Date(f1.lastModified()));
        System.out.println("文件名称：" + f1.getName());
        System.out.println("文件路径转换为字符串输出："+f1.getPath());
        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("父级路径："+f1.getParent());
    }
}
