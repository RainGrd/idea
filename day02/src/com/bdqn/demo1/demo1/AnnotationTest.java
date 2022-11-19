package com.bdqn.demo1.demo1;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 8:30:03
 * @description 注解的使用
 * 1.理解Annotation:
 * 2.使用示例
 *  示例一：生成文档相关的注解
 *  示例二：jdk内置的三个注解
 *  示例三：跟踪代码依赖性，实现替代配置文件功能
 *  3.如何自定义注解：参照@SuppressWarnings
 *      1.注解声明为@interface
 *      2.内部定义成员，通常使用value表示，
 *      3.可以指定成员的默认值，使用default定义
 *      4.如果自定义的注解没有注解，表明这是一个标识作用
 *      如果注解有成员，在使用注解时，需要指明成员的值
 *
 *  4.jdk 提供的4种元注解
 *   什么是元注解：对现有的注解进行解释说明的注解
 *   元注解的分类
 *   @Retention
 *   @Target
 *   @Documented
 *   @Inherited
 *   @Repeatable
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.walk();
        Student student = new Student();
        student.walk();
        @SuppressWarnings("unused")
        ArrayList list = new ArrayList();
    }
}
