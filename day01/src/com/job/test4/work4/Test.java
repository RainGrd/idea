package com.job.test4.work4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/27 15:09:51
 * @description 对录入的人员信息进行有效性验证。录入人员生日时，格式为“年/月/日”，年龄为
 * 18~55岁；录入的密码为6~10位；允许用户进行重复录入，直到输入正确为止。
 */
public class Test {
    /*判断真假*/
    Calendar calendar = Calendar.getInstance();
    Date date = null;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入人员生日(年/月/日)：");
        String birthday = input.nextLine();
        /*实例化对象*/
        Test test = new Test();
        /*密码*/
        String pwd=null;
        /*判断生日是否正确*/
        if (test.format(birthday)) {
            /*判断用户年龄是否正确*/
            if (test.judgeAge()) {
                System.out.println("请输入密码：");
                pwd=input.nextLine();
                while (!test.judgePwd(pwd)) {
                    System.out.println("请重新输入密码：");
                    pwd=input.nextLine();
                }
                System.out.println("你的密码："+pwd);
            }else{
                System.out.println("你的用户年龄不满住设置密码的条件");
            }
        }else {
            System.out.println("你输入的生日格式不符合！");
        }
    }

    /**
     * 方法作用:判断格式是否正确
     */
    public boolean format(String birthday) {
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        boolean flag = true;
        try {
            /*升级判断等级*/
            sdf.setLenient(false);
            date = sdf.parse(birthday);
        } catch (ParseException e) {
//            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    /**
     * 方法作用：判断年龄是否达到18~55
     * 1.先获取当前的时间
     * 2.用当前的时间的年份减去输入的年份判断是否符合条件
     * 3.为真的话返回true
     */
    public boolean judgeAge() {
        boolean flag = true;
        /*转换Date*/
        calendar.setTime(date);
        /*获取当前的时间*/
        Calendar currentDate = Calendar.getInstance();
        System.out.println(currentDate.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.YEAR));
        if (!((currentDate.get(Calendar.YEAR) - calendar.get(Calendar.YEAR)) > 18 && (currentDate.get(Calendar.YEAR) - calendar.get(Calendar.YEAR)) < 55)) {
            flag = false;
        }
        return flag;
    }
    /**
     *
     *方法作用:录入的密码为6~10位；允许用户进行重复录入，直到输入正确为止。
     * 1.判断密码的长度
     * 2.是否正确
     * 3.否的话，进行重复录入
     */
    public boolean judgePwd(String pwd){
        boolean flag = false;
        if (pwd.length()>6 && pwd.length()<10) {
            flag=true;
        }
        return flag;
    }
}
