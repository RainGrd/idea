package com.bdqn.test1.demo6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author wangheng
 * @version 1.0
 * @date 2022/4/11 14:30
 * @description 主方法
 */
public class Reflect2005{

    public static void main(String[] args) {

        //获取类对象的三种方式
        //getClassObject();
        //获取类对象里面的方法
        //getClassMethod();
        //获取类对象属性的
        //getClassAttribute();
        //获取构造方法
        //getClassConstructors();
        //操作属性
        //optionFileds();
        //操作方法
        optionMethod();
    }

    private static void optionMethod() {
        try {
            Class aClass = Class.forName("com.bdqn.chap19.Student05");
            Object obj = aClass.newInstance();//相当于new
            //获取私有方法要用DeclaredMethod();获取公有方法可以用getMethod()
            Method studyMethod = aClass.getDeclaredMethod("study", String.class,int.class);
            studyMethod.setAccessible(true);
            studyMethod.invoke(aClass.newInstance(),"杨鑫",20);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void optionFileds() {
        try {
            Class aClass = Class.forName("com.bdqn.chap19.Student05");
            Object obj = aClass.newInstance();//相当于new
            Field fName = aClass.getDeclaredField("name");
            //过滤访问修饰符，暴力破解
            fName.setAccessible(true);
            fName.set(obj,"江轩");
            System.out.println("通过反射获取到的属性值为："+obj);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void getClassConstructors() {
        try {
            Class aClass = Class.forName("com.bdqn.chap19.Student05");
            Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor ct:declaredConstructors) {
                System.out.println(ct);
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    private static void getClassAttribute() {
        try {
            Class aClass = Class.forName("com.bdqn.chap19.Student05");
            /**
             * 功能描述：
             *   获取当前类对象里面的所有属性,包括父类和接口
             *   但是要符合访问修饰符权限
             */
            Field[] fields = aClass.getFields();
            for (Field f:fields) {
                System.out.println("获取到Student05对象的所有属性为："+f);
            }
            //不需要遵循访问修饰付权限，但是他不能获取父类、接口的属性
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field f2:declaredFields ) {
                System.out.println(f2);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void getClassMethod() {
        try {
            Class aClass = Class.forName("com.bdqn.chap19.Student05");
            /**
             * 功能描述：
             *   获取当前类对象里面的所有方法，包括父类和结构的
             *   但是要符合访问修饰符权限
             */
            Method[] methods = aClass.getMethods();
            for (Method me:methods) {
                System.out.println("获取所有普通成员方法"+me);
            }
            //获取本类的方法名称，不包过父类的
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method me2:declaredMethods){
                //System.out.println(me2);
            }


            //由于java只支持单一继承，所有返回的是单个类对象
            Class superclass = aClass.getSuperclass();
            //由于java实现多接口，所有返回的是类对象数组
            Class[] interfaces = aClass.getInterfaces();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void getClassObject() {
        try {
            //获取类对象的三种方式
            //1:Class.forName();
            Class aClass = Class.forName("com.bdqn.chap19.Student05");
            System.out.println(aClass);
            //2:类名.class
            Class<Student05> student05Class = Student05.class;
            System.out.println(student05Class);
            //对象名.getClass();
           /* Student05 student05 = new Student05();
            Class aClass1 = student05.getClass();
            System.out.println(aClass1);*/

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
