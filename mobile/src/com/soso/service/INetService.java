package com.soso.service;

import com.soso.entity.MobileCard;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：计算流量
 */
public interface INetService {
    /**方法描述：计算这张卡的流量
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 17:17:10 2022/4/13
     * @param flow 流量
     * @param card 电话卡
     * @return int
     *
     **/
    int netPlay(int flow, MobileCard card) throws Exception;
}
