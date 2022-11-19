package com.bdqn.Game;

/**
 * @author: 段荣贵
 */
public class Player {
    public void happy(Game game){
        game.start();   //父类中的方法
        game.play();    //这个方法被子类重写，所以可能是子类中的方法
        game.end();     //一定是父类的方法
        System.out.println("开心！");
    }

}
