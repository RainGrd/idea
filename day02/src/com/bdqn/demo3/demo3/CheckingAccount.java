package com.bdqn.demo3.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 */
public class CheckingAccount {
    private double balance;
    private String accountId;
    public CheckingAccount(String accountId){
        this.accountId = accountId;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    /**
     * @author 段荣贵
     * @description
     * @date 8:37:15 2022/4/6
     * @param amount 账户余额
     * 定义取款方法，当取款金额amount超过balance时，抛出InsufficientFundsException 异常
     **/
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount<=balance){
            balance-=amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountId(){
        return accountId;
    }
}
