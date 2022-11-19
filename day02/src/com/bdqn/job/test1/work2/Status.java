package com.bdqn.job.test1.work2;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 14:15:22
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public enum Status {
    /*汽车类的状态*/
    STOP("现在是红灯,请停车")
    ,DRIVE("现在是绿灯,可以加速了")
    ,SLOWDOWN("现在是黄灯,请减速慢行");
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Status(String description) {
        this.description = description;
    }

}
