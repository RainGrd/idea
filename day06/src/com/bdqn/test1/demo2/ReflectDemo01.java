package com.bdqn.test1.demo2;

import com.bdqn.test1.demo1.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：反射获取成员变量
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*获取Class对象*/
        Class<?> c = Class.forName("com.bdqn.test1.demo1.Student");
        /*返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。*/
//        Field[] fields = c.getFields();
        /*返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。 */
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("-----------");
        /*Field getDeclaredField(String name)
        返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
        */
        Field addressField = c.getField("address");
        System.out.println(addressField);
        /*使用*/
        /*Student student = new Student();
        student.address="西安";
        System.out.println(student);*/
        /*获取无参构造方法创建对象*/
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();
//        obj.addressField="西安";
        /*赋值*/
        addressField.set(obj,"西安");
        System.out.println(obj);
    }
}
