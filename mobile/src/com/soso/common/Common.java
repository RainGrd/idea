package com.soso.common;

import java.text.DecimalFormat;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：公共类
 */
public class Common {
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 20:01:40 2022/4/14
     * @param 
     * @return 
     * 方法描述：转换格式
     **/
    public static double dateFormat(double money){
        DecimalFormat df = new DecimalFormat("#.0");
        return Double.parseDouble(df.format(money));
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 20:08:30 2022/4/15
     * @param
     * @return
     * 方法描述：用于结算账户余额
     **/
    public static double result(double money,double phoneCharge){
        return dateFormat(dateFormat(money)-dateFormat(phoneCharge));
    }
}
