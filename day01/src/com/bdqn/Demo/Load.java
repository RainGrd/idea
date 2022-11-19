package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Load {
    String name;
    String waiHao;
    int age;
    String bangPai;
    public Load(String name,int age,String bangPai){
        this.name = name;
        this.age=age;
        this.bangPai = bangPai;
    }
    public Load(String name, int age, String bangPai,String waiHao) {

        //this 可以本类的其他构造方法
        this(name,age,bangPai);
        this.waiHao = waiHao;
    }
    public static void main(String[] args){
        //构造方法的重载
        //岳不群
        Load load1= new Load("岳不群",18,"华山派");
        //武松
        Load load2 = new Load("武松",18,"梁山","行者");
    }
}
