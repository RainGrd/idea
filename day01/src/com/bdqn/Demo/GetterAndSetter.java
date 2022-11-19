package com.bdqn.Demo;

/**
 * @author: 段荣贵
 */
public class GetterAndSetter {
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //getter和setter
    private String name;
    private int age;
    public void chi(){
        System.out.println(this.name+"在吃东西");
    }
}
