package com.soso.service;

import com.soso.entity.MobileCard;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：计算发送短息次数
 */
public interface ISendService {
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 17:18:04 2022/4/13
     * @param count,card 次数,电话卡
     * @return 
     * 方法描述：计算这个用户发送的短信的次数
     **/
    public int send(int count, MobileCard card) throws Exception;
}
