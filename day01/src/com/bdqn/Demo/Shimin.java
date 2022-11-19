package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Shimin extends Rewrite{
    //重写演示
    public  void makeCountry(){
        super.makeCountry();    //super调用父类中被重写的方法
        System.out.println("李世明也想建立自己的国家！");
    }
    public static void main(String[] args) {
        Shimin shimin= new Shimin();
        shimin.makeCountry();
    }
}
