package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Jurisdiction {
    //访问权限演示
    //public权限演示
    public String name="pubic";
    //private权限演示
    private String pri="private";
    //包访问权限
    String def="defulat";
    public static void main(String[] args) {
        //创建对象
        Jurisdiction jur= new Jurisdiction();
        System.out.println(jur.name);
        System.out.println(jur.pri);
        System.out.println(jur.def);
    }
}
