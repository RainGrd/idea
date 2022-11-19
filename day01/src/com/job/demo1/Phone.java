package com.job.demo1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/22 19:32:50
 * @description 添加汽车电话选项的子类
 */
public class Phone extends Car{
    public String getPhone() {
        return phone;
    }
    //用于判断手机号是否正确
    boolean flag=true;
    /**
     * 验证手机号码
     *
     * 移动号码段:139、138、137、136、135、134、150、151、152、157、158、159、182、183、187、188、147
     * 联通号码段:130、131、132、136、185、186、145
     * 电信号码段:133、153、180、189
     *
     * @param
     * @return
     */
    //汽车所标识的电话号码
    String phone="";
    public void setPhone() {
        Scanner input=new Scanner(System.in);
        System.out.println("请留下你的电话号码：");
        String phone = input.next();
        //电话号码正则表达式
        String regex="0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            //转换类型
            flag=false;
            this.phone=phone;
        }else{
            System.out.println("你的电话号码不符合要求");
            flag = true;
        }

    }
    public Phone(String size) {
        //调用父类的构造方法
        super(size);
        //判断电话号码的正确性
        while (flag) {
            setPhone();
        }
    }

}
