package com.bdqn.demo2;

import com.bdqn.demo3.Con_Annotation;
import com.bdqn.demo3.F_M_P_Annotation;
import com.bdqn.demo3.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println("User类构造方法描述如下");
        /*获取构造方法*/
        Constructor<?>[] declaredCons = User.class.getDeclaredConstructors();
        /*遍历构造方法*/
        for (Constructor<?> declaredCon : declaredCons) {
            if(declaredCon.isAnnotationPresent(Con_Annotation.class)){
                /*获得指定类型的注释*/
                Con_Annotation ca = declaredCon.getAnnotation(Con_Annotation.class);
                /*注释类型*/
                System.out.println(ca.annotationType());
                /*获取并输出注释信息*/
                System.out.println(ca.value());
            }
            Annotation[][] parameterAnnotations = declaredCon.getParameterAnnotations();
            /*遍历构造方法的参数*/
            for (int i=0;i< parameterAnnotations.length; i++) {
                int length=parameterAnnotations[i].length;
                if(length==0){
                    System.out.println("未添加Annotation的参数");
                }else{
                    for(int k=0; k<length; k++){
                        /*获取参数的注释*/
                        F_M_P_Annotation fmpa=(F_M_P_Annotation) parameterAnnotations[i][k];
                        System.out.println("参数描述："+fmpa.describe());
                        System.out.println("参数类型："+fmpa.type());
                    }
                }
                System.out.println();
            }
        }
        System.out.println("User类字段描述");
        Field[] fields = User.class.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(F_M_P_Annotation.class)){
                /*获得指定类型的注释*/
                F_M_P_Annotation fmpa = field.getAnnotation(F_M_P_Annotation.class);
                /*注释类型*/
                System.out.print(fmpa.describe());
                /*获取并输出注释信息*/
                System.out.print(fmpa.type());
            }
            System.out.println();
        }
        System.out.println("User类方法描述");
        Method[] methods = User.class.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(F_M_P_Annotation.class)){
                /*获得指定类型的注释*/
                F_M_P_Annotation fmpa = method.getAnnotation(F_M_P_Annotation.class);
                /*注释类型*/
                System.out.print(fmpa.describe());
                /*获取并输出注释信息*/
                System.out.print(fmpa.type());
            }
            /*获取方法的参数的注释*/
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            /*遍历构造方法的参数*/
            for (int i=0;i< parameterAnnotations.length; i++) {
                int length=parameterAnnotations[i].length;
                if(length==0){
                    System.out.println("未添加Annotation的参数");
                }else{
                    for(int k=0; k<length; k++){
                        /*获取参数的注释*/
                        F_M_P_Annotation fmpa=(F_M_P_Annotation) parameterAnnotations[i][k];
                        System.out.print("参数描述："+fmpa.describe());
                        System.out.print("参数类型："+fmpa.type());
                    }
                }
            }
            System.out.println();
        }
    }
}
