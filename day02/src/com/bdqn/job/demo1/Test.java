package com.bdqn.job.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Test {

    public static void main(String[] args) {
        /*Collection接口（java.util包中）中有
        boolean addAll(Collection<? extends E> c)方法，分析该方法支持什么类型的参数。*/
        Collection collection = new ArrayList();
        collection.addAll(Collections.singleton(""));

    }
}
