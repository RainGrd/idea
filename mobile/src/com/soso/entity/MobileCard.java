package com.soso.entity;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 实体类描述：移动卡类
 */
public class MobileCard {
    /*用户名*/
    private String userName;
    /*卡号*/
    private String cardNumber;
    /*密码*/
    private String passWord;
    /*所属套餐*/
    private BaseServicePackage server;
    /*当月消费总金额*/
    private double conSumAmount;
    /*实际通话时间*/
    private int realTalkTime;
    /*实际发送短信数*/
    private int realSmsCount;
    /*实际产生流量*/
    private int realFlow;
    /*实际账户余额*/
    private double money;
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }



    public BaseServicePackage getServer() {
        return server;
    }

    public void setServer(BaseServicePackage server) {
        this.server = server;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getConSumAmount() {
        return conSumAmount;
    }

    public void setConSumAmount(double conSumAmount) {
        this.conSumAmount = conSumAmount;
    }

    public int getRealTalkTime() {
        return realTalkTime;
    }

    public void setRealTalkTime(int realTalkTime) {
        this.realTalkTime = realTalkTime;
    }

    public int getRealSmsCount() {
        return realSmsCount;
    }

    public void setRealSmsCount(int realSmsCount) {
        this.realSmsCount = realSmsCount;
    }

    public int getRealFlow() {
        return realFlow;
    }

    public void setRealFlow(int realFlow) {
        this.realFlow = realFlow;
    }

    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 16:17:39 2022/4/13
     * @param 
     * @return 
     * 方法描述：显示信息的方法
     **/
    public void showMeg(){
        System.out.println("");
    }
    public MobileCard(String userName, String cardNumber, String passWord, BaseServicePackage server, double conSumAmount, double money) {
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.passWord = passWord;
        this.server = server;
        this.conSumAmount = conSumAmount;
        this.money = money;
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:15:22 2022/4/15
     * @param 
     * @return 
     * 方法描述：初始超人套餐
     **/
    public MobileCard(String userName, String cardNumber, String passWord, BaseServicePackage server, double conSumAmount, int realTalkTime, int realSmsCount, int realFlow, double money) {
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.passWord = passWord;
        this.server = server;
        this.conSumAmount = conSumAmount;
        this.realTalkTime = realTalkTime;
        this.realSmsCount = realSmsCount;
        this.realFlow = realFlow;
        this.money = money;
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:15:04 2022/4/15
     * @param 
     * @return 
     * 方法描述：初始化网虫套餐
     **/
    public MobileCard(String userName, String cardNumber, String passWord, BaseServicePackage server, double conSumAmount, int realFlow, double money) {
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.passWord = passWord;
        this.server = server;
        this.conSumAmount = conSumAmount;
        this.realFlow = realFlow;
        this.money = money;
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:14:48 2022/4/15
     * @param 
     * @return 
     * 方法描述：初始化话痨套餐
     **/
    public MobileCard(String userName, String cardNumber, String passWord, BaseServicePackage server, double conSumAmount, int realTalkTime, int realSmsCount, double money) {
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.passWord = passWord;
        this.server = server;
        this.conSumAmount = conSumAmount;
        this.realTalkTime = realTalkTime;
        this.realSmsCount = realSmsCount;
        this.money = money;
    }
}
