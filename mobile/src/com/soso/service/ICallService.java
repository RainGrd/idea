package com.soso.service;

import com.soso.entity.MobileCard;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：称呼服务
 */
public interface ICallService {
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 17:09:51 2022/4/13
     * @param minCount,card 通话时间,卡片
     * @return
     * 方法描述：计算这张卡的剩余通话时间
     **/
    public int call(int minCount, MobileCard card) throws Exception;
}
