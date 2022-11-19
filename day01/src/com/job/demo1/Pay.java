package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 18:25:16
 * @description 主方法
 */
public class Pay {
    double hours=0; //工作小时
    double wage=8;  //每小时工资
    double rate=0;  //扣缴率
    double total;   //应得工资总额
    double realPay; //实付工资
    //重载的computeNetPay方法
    /*应得工资是工作小时乘以每小时工资的计算结果*/
    /**
     * @author: duanronggui
     * @param:
     * @retrun:
     * @description 当computeNetPay()接收代表工作小时时
     * 应得工资=工作小时*每小时工资*（1—扣缴率）*（1—工资率）
     */
    public double computeNetPay(double hours,double b,double rate){
        this.realPay=hours*this.wage*(1-rate)*(1-b);
        return Math.round(this.realPay);
    }

    /**
     * @author: duanronggui
     * @param:
     * @retrun:
     * @description 当computeNetPay()接收两个参数时，扣缴率假定为15%
     *计算公式：工作小时*每小时工资*（1—0.15）*（1—工资率）
     */
    public double computeNetPay(double hours,double b){
        return this.realPay=hours *this.wage* (1-0.15) * (1-b);
    }

    /**
     * @author: duanronggui
     * @param:
     * @retrun:
     * @description 当computeNetPay()接收一个参数时，扣缴率假定为15%，每
     * 小时工资率为4.65%。
     * 计算公式：工作小时*每小时工资*（1—0.15）*（1—工资率乘与100）
     */
    public double computeNetPay(double hours){
        return this.realPay=hours *this.wage* (1-0.15) * (1-4.65/100);
    }

}
