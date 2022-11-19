package com.bdqn.Idao;

/**
 * @author: 段荣贵
 */
public class MySqlDao extends AbstractDao{
    @Override
    public void connect() {
        System.out.println("MySQL的连接");
    }
}
