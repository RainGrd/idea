package com.demo;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/28 8:31:23
 * @description 主方法
 */
public class TimeTest {
    //    public static <Month> void main(String[] args) {
//        // 本地日期
//        LocalDate localDate = LocalDate.of(2019, 2, 14);
//        System.out.println(localDate);
//        int year = localDate.getYear(); //哪一年
//        System.out.println("year = " + year);
//        Month month = (Month) localDate.getMonth(); // 第几个月
//        System.out.println("month = " + month);
//        int dayOfMonth = localDate.getDayOfMonth(); //一个月的第几天
//        System.out.println("dayOfMonth = " + dayOfMonth);
//        DayOfWeek dayOfWeek = localDate.getDayOfWeek(); //一周的第几天
//        System.out.println("dayOfWeek = " + dayOfWeek);
//        int lenth = localDate.lengthOfMonth(); // 一个月的天数
//        System.out.println("lenth = " + lenth);
//        boolean leapYear = localDate.isLeapYear(); // 是否是闰年
//        System.out.println("leapYear = " + leapYear);
//    }
    @Test
    public void testDate() {
        Date date1 = new Date();
    }

    /**
     * 方法作用：java8 java.time包 时间处理类测试
     * 说明：LocalDateTime使用率较高
     */
    @Test
    public void test1() {
        /*localDate,localTime,localDateTime无法实例化*/
        /*now()，获取当前日期、时间、日期加时间*/
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        /*年月日*/
        System.out.println(localDate);
        /*毫秒数*/
        System.out.println(localTime);
        /*年月日毫秒数*/
        System.out.println(localDateTime);
        /*of():没有偏移量*/
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23);
        System.out.println(localDateTime1);

        /*getXxx():*/
        /*获取年份*/
        System.out.println(localDateTime1.getYear());
        /*这个月的第几天*/
        System.out.println(localDateTime1.getDayOfMonth());
        /*这个月(英文)*/
        System.out.println(localDateTime1.getMonth());
        /*这周的第几天*/
        System.out.println(localDateTime1.getDayOfWeek());
        /*这个月(数字)*/
        System.out.println(localDateTime1.getMonthValue());
        /*时针*/
        System.out.println(localDateTime1.getMinute());
        /*width()操作:体现了不可变性，不会影响原来的操作*/
        /*根据日期获取当前日期格式：yyyy-MM-dd*/
        LocalDate localDate1=localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);
        /*添加操作*/
        /*增加三个月*/
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime2);
    }
    @Test
    public void test2(){
        Instant instant = Instant.now();
        /*格林威治时间*/
        System.out.println(instant);
        /*中国北京时间*/
        System.out.println(instant.atOffset(ZoneOffset.ofHours(8)));
        /*获取对应的毫秒数*/
        System.out.println(instant.toEpochMilli());
        /**/
        Instant instant1 = Instant.ofEpochMilli(1648438049886L);
        System.out.println(instant1);
    }
    /**
     *
     *方法作用:格式化时间
     */
    @Test
    public void test3() {
        /*方式一：*/
        DateTimeFormatter forMatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now=LocalDateTime.now();
        //格式化:日期-->字符串
        String str=forMatter.format(now);
        System.out.println(str);
        System.out.println(now);
        /*解析：字符串-->日期*/
        TemporalAccessor parse = forMatter.parse("2022-03-28T11:39:19.788");
        System.out.println(parse);
        /*方式二：本地化，一般适用于查看日历*/
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2=formatter1.format(now);
        System.out.println(str2);
        /*FormatStyle.LONG\FormatStyle.MEDIUM\FormatStyle.SHORT\FormatStyle.FULL*/
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String str3=formatter2.format(now);
        System.out.println(str3);
        /*重点：方式三：自定义*/
        DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        /*格式化*/
        String str4=formatter3.format(now);
        System.out.println(str4);
        /*转换*/
        TemporalAccessor accessor = formatter3.parse("2022-03-28 02:27:43");
        System.out.println(accessor);

    }

}
