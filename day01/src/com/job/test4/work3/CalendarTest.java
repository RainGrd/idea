package com.job.test4.work3;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 14:38:25
 * @description 日历
 * 编写一个应用程序，先输入年和月，然后输出此月的日历页
 */
public class CalendarTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月：");
        int month = input.nextInt();
        CalendarTest test = new CalendarTest();
        test.showCalendar(year,month);
    }


    /**
     *
     *方法作用:输出此月的日历页
     */
    public void showCalendar(int year,int month){
        /*转换格式*/
        Calendar calendar= Calendar.getInstance();
        /*Java月份从零开始*/
        calendar.set(year,month-1,1);
        /*获取这个月有多少天数*/
        int day=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        /*补空格*/
        int temp=0;
        /*获取这个月的周*/
        int week=calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 0; i < week-1; i++) {
            System.out.print("\t");
            temp++;
        }
        /*根据天数输出*/
        for (int i = 1; i <=day; i++){
            /*输出*/
            System.out.print(i+"\t");
            /*换行*/
            if ((temp+i)%7==0) {
                System.out.println();
            }
        }
    }

}
