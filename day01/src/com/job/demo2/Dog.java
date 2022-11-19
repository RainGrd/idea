package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 11:25:36
 * @descriptio 狗类
 */
public class Dog extends Pet{
    /*狗的品种*/
    private String strain;



    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    /**
     * 初始化数据
     *
     * @param name
     * @param health
     * @param love
     *
     */
    public Dog(String name, int health, int love,String strain) {
        /*调用父类的构造方法进行初始化数据*/
        super(name, health, love);
        this.strain=strain;
    }

    /**
     * 重写父类的打印方法
     * 通过this关键获取父类的定义的私有属性
     */
    @Override
    public void print(){
        /*调用父类的方法*/
       super.print();
        System.out.println("狗的品种："+this.getStrain());
    }
}
