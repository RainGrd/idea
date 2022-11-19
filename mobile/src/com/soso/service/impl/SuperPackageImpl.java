package com.soso.service.impl;

import com.soso.common.Common;
import com.soso.entity.BaseServicePackage;
import com.soso.entity.MobileCard;
import com.soso.service.ICallService;
import com.soso.service.INetService;
import com.soso.service.ISendService;
import com.soso.tools.CardUtil;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：超人套餐
 */
public  class SuperPackageImpl extends BaseServicePackage implements ICallService, ISendService, INetService {
    /*通话时间*/
    private int talkTime;
    /*短信次数*/
    private int smsCount;
    /*流量*/
    private int flow;

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

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    @Override
    public void showInfo() {
        System.out.println("超人套餐：通话时长为" + talkTime + "分钟/月,短信条数为" + smsCount + "条/月" + ",上网流量为" + flow/1024 + "GB/月");
    }

    @Override
    public int call(int minCount, MobileCard card) throws Exception {
        int i=minCount;
        for (int j = 0; j < minCount; j++) {
            /*剩余通话时长大于1*/
            if (this.talkTime - card.getRealTalkTime() > 1) {
                /*设置实际通话时间*/
                card.setRealTalkTime(card.getRealTalkTime() + 1);
            } else
                /*判断账户余额是否超过0.2元*/
                if (card.getMoney() >= 0.1) {
                    /*实际通话时长加1*/
                    card.setRealTalkTime(card.getRealTalkTime() + 1);
                    /*消费账户余额*/
                    card.setMoney(Common.result(card.getMoney(), 0.2));
                    /*本月消费金额*/
                    card.setConSumAmount(card.getConSumAmount() + 0.2);
                } else {
                    /*自定义当前异常，抛出异常信息*/
                    throw new Exception("本次已通话" + i + "分钟，你的余额不足。请充值后再使用！");
                }
        }
        return i;
    }

    @Override
    public int netPlay(int flow, MobileCard card) throws Exception {
        int calFlow=flow;
        for (int j = 0; j < flow; j++) {
            /*剩余流量大于1MB*/
            if (this.flow - card.getRealFlow() > 1) {
                /*设置实际使用流量*/
                card.setRealFlow(card.getRealFlow() + 1);
            } else
                /*判断账户余额是否超过0.2元*/
                if (card.getMoney() >= 0.2) {
                    /*实际使用流量加1MB*/
                    card.setRealFlow(card.getRealFlow() + 1);
                    /*消费账户余额*/
                    card.setMoney(Common.result(card.getMoney(), 0.1));
                    /*本月消费金额*/
                    card.setConSumAmount(card.getConSumAmount() + 0.1);
                } else {
                    /*如果两个条件都不满足的话，则需要将流量设置超出*/
                    calFlow=j;
                    /*自定义当前异常，抛出异常信息*/
                    throw new Exception("本次已使用超出流量为" + Common.dateFormat(calFlow) + "MB，你的余额不足。请充值后再使用！");
                }
        }
        return calFlow;
    }
    @Override
    public int send(int count, MobileCard card) throws Exception {
        int calCount=count;
        /*判断这个卡里是否还有余额*/
        for (int j = 0; j < count; j++) {
            /*剩余短信条数*/
            if (this.smsCount-card.getRealSmsCount() > 1) {
                /*设置实际使用短信条数加一*/
                card.setRealSmsCount(card.getRealSmsCount() + 1);
            } else
                /*判断账户余额是否超过0.1元*/
                if (card.getMoney() >= 0.1) {
                    /*实际短信条数加一*/
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

    public SuperPackageImpl() {
        this.talkTime = 200;
        this.smsCount = 50;
        this.flow = 1*1024;
        super.setPrice(78.0);
    }
}
