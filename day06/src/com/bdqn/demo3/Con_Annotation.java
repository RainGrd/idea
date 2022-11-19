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
@Target({ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Con_Annotation {
    String value()default "默认构造方法";
}
