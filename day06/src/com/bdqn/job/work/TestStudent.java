package com.bdqn.job.work;

import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestStudent{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生信息(姓名:年龄:成绩)：");
        String info=input.nextLine();
        /*获取Class对象*/
        try {
            Class<?> aClass = Class.forName("com.bdqn.job.work.Student");
            /*创建对象*/
            Constructor<?> con = aClass.getConstructor(String.class, int.class, int.class);
            /*进行拆分*/
            String[] split = info.split(":|：");
            /*初始化学生信息*/
            Object obj = con.newInstance(split[0],Integer.parseInt(split[1]),Integer.parseInt(split[2]));
            /*调用toString()方法*/
            System.out.println(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
