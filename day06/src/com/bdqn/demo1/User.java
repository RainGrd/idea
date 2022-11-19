package com.bdqn.demo1;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class User {
    private int age;
    private String uname;

    public User(int age, String uname) {
        super();
        this.age = age;
        this.uname = uname;
    }
    public User(){

    }

    public User(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    /**
     * @author 段荣贵
     * @description //TODO 肖萧奈何桥
     * @date 9:20:20 2022/4/11
     * @param 
     * @return 
     * 方法描述：打印方法
     **/
    public void printName(){
        System.out.println("我的名字是" +uname);
    }
}
