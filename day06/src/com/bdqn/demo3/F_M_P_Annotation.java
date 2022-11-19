package com.bdqn.demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface F_M_P_Annotation {
    String describe();//定义一个没有默认值的String成员
    Class type()default void.class; //定义一个具有默认值的class成员
}
