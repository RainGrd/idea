package com.soso.service.impl;

import com.soso.common.Common;
import com.soso.entity.BaseServicePackage;
import com.soso.entity.MobileCard;
import com.soso.service.INetService;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：网虫套餐
 */
public class NetPackageImpl extends BaseServicePackage implements INetService {
    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    /*流量 1GB为单位*/
    private int flow;

    @Override
    public void showInfo() {
        System.out.println("网虫套餐：上网流量为"+flow/1024+"GB/月");
    }

    public NetPackageImpl() {
        this.flow = 3*1024;
        super.setPrice(68.0);
    }

    @Override
    public int netPlay(int flow, MobileCard card) throws Exception {
        int calFlow=flow;
        for (int j = 0; j < flow; j++) {
            /*剩余流量大于1*/
            if ((this.flow - card.getRealFlow() > 1)) {
                /*设置实际使用流量*/
                card.setRealFlow(card.getRealFlow() + 1);
            } else
                /*判断账户余额是否超过0.2元*/
                if (card.getMoney() >= 0.1) {
                    /*实际使用流量加1MB*/
                    card.setRealTalkTime(card.getRealFlow() + 1);
                    /*消费账户余额*/
                    card.setMoney(Common.result(card.getMoney(), 0.1));
                    /*本月消费金额*/
                    card.setConSumAmount(card.getConSumAmount() + 0.1);
                } else {
                    /*如果两个条件都不满足的话，则需要将流量设置超出*/
                    calFlow=j;
                    /*自定义当前异常，抛出异常信息*/
                    throw new Exception("本次已使用流量为" + calFlow + "MB，你的余额不足。请充值后再使用！");

                }
        }
        return calFlow;
    }
}
