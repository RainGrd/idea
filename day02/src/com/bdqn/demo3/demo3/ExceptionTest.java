package com.bdqn.demo3.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class ExceptionTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount("0001");
        System.out.println("存款500元");
        account.deposit(500.0);
        try {
            System.out.println("取款100元...");
            account.withdraw(100.00);
            System.out.println("取款600元...");
            account.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("对不起,账户金额不足，您只能取款"+e.getAmount()+"元");
            e.printStackTrace();
        }
    }
}
