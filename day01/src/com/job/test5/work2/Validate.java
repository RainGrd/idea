package com.job.test5.work2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/30 20:09:31
 * @description: 主方法
 * @version: 1.0
 * @param：
 */
public class Validate {


    /**
     * 方法作用：判断密码长度
     */
    public static boolean pwdLengt(String pwd){
        boolean flag=false;
        if (pwd.length()>6 && pwd.length()<10) {
            flag=true;
        }
        return flag;
    }
    /**
     *方法作用：判断密码与旧密码是否一致
     */
    public static boolean isPwd(String pwd,String rPwd) {
        boolean flag=true;
        if (!rPwd.equals(pwd)) {
            flag = false;
        }
        return flag;
    }
    /**
     *方法作用：判断生日
     */
    public static boolean isBirthDay(String birthDay){
        boolean flag=true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.setLenient(false);
            sdf.parse(birthDay);
        } catch (ParseException e) {
//            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
    /**
     *方法作用：判断手机号码：长度11位，并以13、15、17、18为开头
     */
    public static boolean judgePhone(String phone){
        boolean flag=true;
        Pattern pattern = Pattern.compile("^1[3578]\\d{9}");
        Matcher matcher = pattern.matcher(phone);
        /*判断长度*/
        if (phone.length()<11) {
            flag = false;
        }else if (!matcher.matches()) {
            flag = false;
        }
        return flag;
    }
    /**
     *方法作用：判断电子邮箱
     */
    public static boolean mailValidate(String mail) {
        boolean flag = true;
        Pattern pattern = Pattern.compile("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
    /**
     *方法作用：判断你的身份证号码
     */
    public static boolean judgeIdNumber(String id) {
        Pattern pattern = Pattern.compile("\\d{15}|\\d{17}[\\dxX]");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    /**
     *方法作用：判断你的出生日期
     */
    public static boolean judgeData(String date){
        boolean flag=true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.setLenient(false);
            sdf.parse(date);
        } catch (ParseException e) {
//            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
