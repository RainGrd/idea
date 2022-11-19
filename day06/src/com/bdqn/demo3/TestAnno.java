package com.bdqn.demo3;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class TestAnno {
    public static void main(String[] args) {
        Annotation[] annotations = Student.class.getAnnotations();
        for (Annotation annotation : annotations) {
            /*输出class类名*/
            System.out.println(annotation.annotationType().getName());
            APIS api = (APIS) annotation;
            for (API a : api.value()) {
                /*输出默认描述*/
                System.out.println(a.content());
            }
        }
        APIS annotation = Student.class.getAnnotation(APIS.class);
        System.out.println(annotation.value()[0].content());
        AnnotatedType[] annotatedInterfaces = Student.class.getAnnotatedInterfaces();
        for (AnnotatedType annotatedInterface : annotatedInterfaces) {
            System.out.println(annotatedInterface.getType());
        }
        Student.class.getComponentType();
    }
}
