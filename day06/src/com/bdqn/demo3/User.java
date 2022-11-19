package com.bdqn.demo3;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class User {
    @F_M_P_Annotation(describe = "年龄", type = int.class)
    int age;
    @F_M_P_Annotation(describe = "姓名", type = String.class)
    String uName;

    @Con_Annotation("默认构造方法")

    public User() {

    }

    @Con_Annotation("初始化构造方法")
    public User(@F_M_P_Annotation(describe = "年龄", type = int.class) int age
            , @F_M_P_Annotation(describe = "姓名", type = String.class) String uName) {
        this.age = age;
        this.uName = uName;
    }

    @F_M_P_Annotation(describe = "获得年龄")

    public int getAge() {
        return age;
    }

    @F_M_P_Annotation(describe = "设置年龄", type = int.class)

    public void setAge(int age) {
        this.age = age;
    }
    @F_M_P_Annotation(describe = "获取名称")
    public String getuName() {
        return uName;
    }
    @F_M_P_Annotation(describe = "设置姓名",type = String.class)
    public void setuName(String uName) {
        this.uName = uName;
    }
    @F_M_P_Annotation(describe = "输出姓名")
    public void printName(){
        System.out.println("我的名字是："+uName);
    }
}
