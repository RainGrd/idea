package com.wrap.demo1;

import org.junit.Test;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/21 20:27:41
 * @description 包装类使用的面试题
 */
public class InterviewTest {
    @Test
    public void test1(){
        Object o1=true ? new Integer(1):new Double(2.0);
        System.out.println(o1);
    }
    @Test
    public void test2() {
        Object o2;
        if (true) {
            o2=new Integer(1);
        } else {
            o2=new Double(2.0);
        }

        System.out.println(o2);
    }
    @Test
    public void method1(){
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);   //false
        Integer m=1;
        Integer n=1;
        System.out.println(m==n); //true
        /*
        知识点：Integer内部定义了IntegerCache结构，
        IntegerCache中定义了Integer[]数组，保存了从-128~127的范围内的整数
        如果我们使用自动装箱的方法，给Integer赋值的范围在指定范围内，则可以直接数组中的元素
        不用在去new了 目的：提高效率
        * */
        Integer x=128;   //相当于new了一个Integer对象
        Integer y=128;
        System.out.println(x==y); //false
    }
}
