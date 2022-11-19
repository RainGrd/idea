package com.bdqn.Idao;

import java.util.Scanner;

/**
 * @author: 段荣贵
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("请问你要连接的数据库是哪一个？(1,MySQl, 2,Oracle)");
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        //创建接口对象
        IDAO dao = null;
        //多态的表现性
        if(n==1){
            dao=new MySqlDao();
        }else if(n==2){
            dao = new Oracle();
        }
        //调用方法
        dao.connect();
        dao.add();
        dao.delete();
        dao.upddate();
        dao.select();

    }
}
