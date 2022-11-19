package com.bdqn.Demo;
/**
 * @author: 段荣贵
 */
public class Diamond {
    //测试final关键字
    final int weight=10;    //10克拉的钻石
    public final void blibli(){
        System.out.println("不灵不灵的");
    }
    public static void main(String[] args) {
        Diamond d = new Diamond();
//        d.weight = 5;
    }
}
