package com.bdqn.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author: 段荣贵
 */
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream("D:\\聊天文档\\3408396469\\FileRecv\\好东西"));
        System.out.println(reader.readObject());
    }
}
