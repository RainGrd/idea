package com.bdqn.test1.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /*获取Class对象*/
        Class<?> c = Class.forName("com.bdqn.test1.demo1.Student");
        /*创建一个参数的学生对象，*/
        Constructor<?> cons = c.getDeclaredConstructor(String.class);
        /*暴力反射：*/
        Object obj = cons.newInstance("林青霞");
        System.out.println(obj);
    }
}
