package com.soso.service.impl;

import com.soso.common.Common;
import com.soso.entity.BaseServicePackage;
import com.soso.entity.MobileCard;
import com.soso.service.ICallService;
import com.soso.service.ISendService;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：话唠套餐类
 */
public class TalkPackageImpl extends BaseServicePackage implements ICallService, ISendService {
    /*谈话时间*/
    private int talkTime;
    /*短信*/
    private int smsCount;

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    @Override
    public void showInfo() {
        System.out.println("话唠套餐:通话时长为"+talkTime+"分钟/月，短信条数为"+smsCount+"条/月");
    }

    @Override
    public int call(int minCount, MobileCard card) throws Exception {
        int j ;
        for (j=0; j < minCount; j++) {
            /*剩余通话时长大于1*/
            if ((this.talkTime - card.getRealTalkTime() > 1)) {
                /*设置实际通话时间*/
                card.setRealTalkTime(card.getRealTalkTime() + 1);
            } else
                /*判断账户余额是否超过0.2元*/
                if (card.getMoney() >= 0.2) {
                        /*超出套餐的计费
通话：0.2元/分钟
短信：0.1元/分钟
上网流量：0.1元/MB（1GB=1024MB）*/
                    /*通话时长加1*/
                    card.setRealTalkTime(card.getRealTalkTime() + 1);
                    /*消费账户余额*/
                    card.setMoney(Common.result(card.getMoney(), 0.2));
                    /*本月消费金额*/
                    card.setConSumAmount(card.getConSumAmount() + 0.2);
                }else{
                    /*自定义当前异常，抛出异常信息*/
                    throw new Exception("本次已通话"+j+"分钟，你的余额不足。请充值后再使用！");
                }
        }
        return j;
    }

    @Override
    public int send(int count, MobileCard card) throws Exception {
        int calCount=count;
        for (int j = 0; j < count; j++) {
            /*剩余短信条数*/
            if ((this.smsCount-card.getRealSmsCount() > 1)) {
                /*设置实际使用短信条数加一*/
                card.setRealSmsCount(card.getRealSmsCount() + 1);
            } else
                /*判断账户余额是否超过0.1元*/
                if (card.getMoney() >= 0.1) {
                    /*实际使用流量加1MB*/
                    card.setRealSmsCount(card.getRealSmsCount() + 1);
                    /*消费账户余额*/
                    card.setMoney(Common.result(card.getMoney(), 0.1));
                    /*本月消费金额*/
                    card.setConSumAmount(card.getConSumAmount() + 0.1);
                } else {
                    /*如果两个条件都不满足的话，则需要将短信条数设置超出*/
                    calCount=j;
                    /*自定义当前异常，抛出异常信息*/
                    throw new Exception("本次已使用短信" + calCount + "条，你的余额不足。请充值后再使用！");
                }
        }
        return calCount;
    }

    public TalkPackageImpl() {
        this.talkTime = 500;
        this.smsCount = 30;
        super.setPrice(58.0);
    }


    @Override
    public String toString() {
        return "TalkPackage{" +
                "talkTime=" + talkTime +
                ", smsCount=" + smsCount +
                '}';
    }
}
