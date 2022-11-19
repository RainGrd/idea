package com.job.demo2;

/**
 * @version 1.0
 * @author: duan.rong.gui
 * @date 2022/3/24 11:18:07
 * @description 宠物类
 */
public class Pet {
    /*宠物名称*/
    private String name;
    /*宠物的健康状态*/
    private int health;
    /*亲密度*/
    private int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    /**
     * 打印宠物的名称、健康状况、亲密度
     */
    public void print(){
        System.out.println("宠物名称："+name);
        System.out.println("健康状况："+health);
        System.out.println("亲密度："+love);
    }

    /**
     * 初始化数据
     */
    public Pet(String name,int health,int love){
        this.name = name;
        this.health = health;
        this.love = love;
    }
}
