package com.bdqn.test5.demo1;

public class ThreadPriority extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }

}
