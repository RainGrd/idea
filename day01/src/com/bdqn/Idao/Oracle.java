package com.bdqn.Idao;

import com.bdqn.Idao.AbstractDao;

/**
 * @author: 段荣贵
 */
public class Oracle extends AbstractDao {
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }
}
