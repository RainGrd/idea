package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class TestGetterAndSetter {

    public static void main(String[] args) {
        TestGetterAndSetter test= new TestGetterAndSetter();
        GetterAndSetter GetterAndSetter= new GetterAndSetter();
        GetterAndSetter.setName("周润发");
        GetterAndSetter.setAge(-1);     //语法是没有问题的，但是逻辑上会有问题
        //
        GetterAndSetter.chi();
        System.out.println(GetterAndSetter.getName());
        System.out.println(GetterAndSetter.getAge());
    }
}
