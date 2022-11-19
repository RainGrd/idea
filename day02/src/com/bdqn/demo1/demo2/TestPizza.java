package com.bdqn.demo1.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 20:37:07
 * @description 主方法
 */
public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        /*根据披萨的派送状态，返回派送时间*/
        pizza.setStatus(PizzaStatus.READY);
        pizza.printTimeTODeliver();
    }
}
