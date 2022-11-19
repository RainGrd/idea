package com.bdqn.demo1.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/29 8:48:58
 * @description 定义注解
 */
public @interface MyAnnotation {
    /*如果是参数列表的话，一般定义为value，
    * 默认则为default
    * 没有成员定义的一般称之为标记
    * */
    String value() default "hello";
}
