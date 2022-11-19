package com.bdqn.test1.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReflectDemo02 {
    public static void main(String[] args) {
        /*获取Class对象*/
        try {
            Class<?> aClass = Class.forName("com.bdqn.test1.demo1.Student");
            Constructor<?> con = aClass.getConstructor();
            Object obj = con.newInstance();
            /*调用无参方法*/
            Method m1 = aClass.getMethod("method1");
            m1.invoke(obj);
            /*调用有参方法*/
            Method m2 = aClass.getMethod("method2",String.class);
            m2.invoke(obj,"林青霞");
            /*调用有返回值的方法*/
            Method m3 = aClass.getMethod("method3", String.class, int.class);
            Object invoke = m3.invoke(obj, "林青霞", 30);
            System.out.println(invoke.toString());
            /*调用私有的方法*/
            Method function = aClass.getDeclaredMethod("function");
            function.setAccessible(true);
            function.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
