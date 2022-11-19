package com.job.demo1;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 19:22:59
 * @description 车子类
 */
public class Car {
    //汽车的规格：大、中、小的价格
    double big = 300;
    double in = 90;
    double small = 70;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch (size) {
            case "大":
                this.size=size;
                setPreRent(big);
                break;
            case "中":
                this.size = size;
                setPreRent(in);
                break;
            case "小":
                this.size=size;
                setPreRent(small);
                break;
            default:
                System.out.println("没有此规格的汽车");
                break;
        }
    }

    //实际大小
    String size = "";

    public double getPreRent() {
        return preRent;
    }

    //
    public void setPreRent(double preRent) {
        this.preRent = preRent;
    }

    double preRent = 0;  //日租金

    public Car(String size) {
        //判断大小是否正确
        setSize(size);

    }
    //计算租用汽车价格的方法
    public double calRent(int days) {
        if (days > 7 && days <= 30) {
            //days大于7天，9折
            return getPreRent() * days * 0.9;
        } else if (days > 30 && days <= 150) {
            //days大于30天，8折
            return getPreRent() * days * 0.8;
        } else if (days > 150) {
            //days大于150天，7折
            return getPreRent() * days * 0.7;
        }
        return 0;
    }
}
