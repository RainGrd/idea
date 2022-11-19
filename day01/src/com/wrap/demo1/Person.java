package com.wrap.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 8:33:46
 * @description 封装
 */
public class Person {
    String color="";
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Person person = new Person();
        //传值
        person.setColor("红色");
        //调用
        System.out.println(person.getColor());
    }
}
