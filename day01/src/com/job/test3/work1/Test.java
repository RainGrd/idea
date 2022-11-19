package com.job.test3.work1;

import java.util.Calendar;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 8:44:41
 * @description 主方法
 */
public class Test {
    public static void main(String[] args) {
        Billboard billboard = new Billboard();
        billboard.showBillboard(new TengXu("腾讯", "在线精彩 生活更精彩", 1998, 11, 11));
        billboard.showBillboard(new Albb("阿里巴巴","让天下没有难做的生意",1999,4,4));
    }
}
