package com.bdqn.connector;

/**
 * @author: 段荣贵
 */

public class Gold implements Valuable{
    /*
    * 类是不可以通过extends关键字继承接口，只能通过implements实现类，并且需要实现(重写)接口类的抽象方法*/
    @Override
    public void getMoney(){
        System.out.println("黄金可以换钱");

    }

}
