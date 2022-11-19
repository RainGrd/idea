package com.bdqn.test1.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

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
            Class<?> c = Class.forName("com.bdqn.test1.demo1.Student");
            /*创建构造方法*/
            Object obj = c.newInstance();
            /*根据Field获取属性*/
            Field nameField = c.getDeclaredField("name");
            //解除设置权限
            nameField.setAccessible(true);
            nameField.set(obj, "林青霞");
            Field ageField = c.getDeclaredField("age");
            //解除设置权限
            ageField.setAccessible(true);
            ageField.set(obj, 30);
            Field addressField = c.getDeclaredField("address");
            //解除设置权限
            addressField.setAccessible(true);
            addressField.set(obj, "西安");
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
