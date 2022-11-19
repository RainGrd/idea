package com.bdqn.test1.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：反射获取构造方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) {
        /*获取Class对象*/
        try {
            Class<?> aClass = Class.forName("com.bdqn.test1.demo1.Student");
            /*Constructor<?>[]getConstructors()
            返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象。 */
            /*Constructor<?>[] cons = aClass.getConstructors();
            System.out.println(cons);
            */
            /*Constructor<?>[] getDeclaredConstructors()
            返回一个反映 Constructor对象表示的类声明的所有 Constructor对象的数组类 包括private、default、public修饰符修饰的构造方
            */
            Constructor<?>[] cons = aClass.getDeclaredConstructors();
            for (Constructor<?> con : cons) {
                System.out.println(con);
            }
            System.out.println("--------");
            /*Constructor<T> getConstructor(类<?>... parameterTypes)
            返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共类函数。
            */
            try {
                Constructor<?> con = aClass.getConstructor();
                System.out.println(con);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            /*
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
            返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定类函数。
            */
            //参数：你要获取的构造方法参数的个数和数据类型对应的字节码文件对象
            try {
                Constructor<?> con = aClass.getDeclaredConstructor();
//                Student stu=new Student();
                /*用反射创建对象*/
                Object obj = con.newInstance();
                System.out.println(obj);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
