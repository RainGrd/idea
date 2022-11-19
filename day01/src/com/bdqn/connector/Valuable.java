package com.bdqn.connector;
/*
接口与类只能是实现关系，类只能通过implements关键字进行
*/
public interface Valuable { //接口使用interface
    /*
    抽象类中所有的内容都是公开的，公共的
    */
    int money=100;  //其实这个变量是一个被 public static final关键修饰过的变量
    public void getMoney();    //接口都是抽象方法，可以省略不写abstract

}
