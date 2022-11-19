package com.soso.common;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：定义套餐
 *         /*超出套餐的计费
 * 通话：0.2元/分钟
 * 短信：0.1元/分钟
 * 上网流量：0.1元/MB（1GB=1024MB）
 */
public enum Billing {
    /*通话，短信，上网*/
    TALk,SMS,NETWORK;
}
