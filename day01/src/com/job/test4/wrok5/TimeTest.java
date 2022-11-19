package com.job.test4.wrok5;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/29 18:58:12
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class TimeTest {
    public static void main(String[] args) {
        /*计算七天后是星期几*/
        LocalDateTime localDateTime = LocalDateTime.now();
        /*获取今天是星期几*/
        int dayOfWeek = localDateTime.getDayOfWeek().getValue();
        System.out.println(dayOfWeek);
        int day= (dayOfWeek+7)%7;
        System.out.println("七天后是星期"+day);
    }
}
