package com.bdqn.test1.demo5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        /*Student student = new Student();
        student.study();
        Teacher teacher = new Teacher();
        teacher.teach();*/
        /*利用反射通过配置文件运行类中的方法*/
        /*加载数据*/
        Properties prop=new Properties();
        try {
            FileReader fr=new FileReader("D:\\学习资料\\idea\\day06\\src\\class.txt");
            prop.load(fr);
            /*关闭流*/
            fr.close();
            String className=prop.getProperty("className");
            String methodName = prop.getProperty("methodName");
            /*通过反射来使用*/
            Class<?> aClass = Class.forName(className);
            Constructor<?> c1 = aClass.getConstructor();
            Object obj = c1.newInstance();
            Method m = aClass.getMethod(methodName);
            m.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
