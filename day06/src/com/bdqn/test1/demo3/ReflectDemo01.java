package com.bdqn.test1.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class ReflectDemo01 {
    public static void main(String[] args) {
        /*获取Class对象*/
        try {
            Class<?> c = Class.forName("com.bdqn.test1.demo1.Student");
//            Method[] methods = c.getMethods();
            Method[] methods=c.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println("-----------");
            /*获取单个方法*/
            Method m1 = c.getMethod("method1");
            System.out.println(m1.getClass());
            System.out.println(m1.getName());
            /*利用吴无参构造方法创建对象*/
            Constructor<?> con = c.getConstructor();
            Object obj = con.newInstance();
            /**/
            System.out.println(m1.getParameterCount());
            System.out.println(m1.getParameterTypes());
            System.out.println(m1.getModifiers());
            System.out.println(Modifier.isPublic(m1.getModifiers()));
            System.out.println(Modifier.isAbstract(m1.getModifiers()));
            System.out.println(Modifier.isAbstract(m1.getModifiers()));
            System.out.println(Modifier.isFinal(m1.getModifiers()));
            System.out.println(Modifier.isStatic(m1.getModifiers()));
            System.out.println(Modifier.isNative(m1.getModifiers()));
            Object invoke = m1.invoke(obj);
            /*
            obj – 调用底层方法的对象
            args – 用于方法调用的参数
            */
            System.out.println(invoke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
