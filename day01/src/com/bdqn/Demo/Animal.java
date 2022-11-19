package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public void eat(){
        System.out.println("动物再吃！");
    }
}
