package com.soso.entity;

import java.util.Objects;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：显示消费记录
 */
public class ConSumInfo{
    /*电话卡号*/
    private String cardNumber;
    /*消费类型*/
    private String type;
    /*消费数据*/
    private int conSumData;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getConSumData() {
        return conSumData;
    }

    public void setConSumData(int conSumData) {
        this.conSumData = conSumData;
    }

    public ConSumInfo(String cardNumber, String type, int conSumData) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.conSumData = conSumData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConSumInfo that = (ConSumInfo) o;
        return conSumData == that.conSumData && Objects.equals(cardNumber, that.cardNumber) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, type, conSumData);
    }

    @Override
    public String toString() {
        return "ConSumInfo{" +
                "cardNumber='" + cardNumber + '\'' +
                ", type='" + type + '\'' +
                ", conSumData=" + conSumData +
                '}';
    }
}
