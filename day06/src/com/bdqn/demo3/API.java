package com.bdqn.demo3;

import java.lang.annotation.Repeatable;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
@Repeatable(APIS.class)
public @interface API {
    String content() default "请添加描述";
}
