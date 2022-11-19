package com.bdqn.Game;

/**
 * @author: 段荣贵
 */
public class Client {
    public static void main(String[] args) {
        //多态
        Game game1=new Dnf();
        Game game2 = new Lol();
        Game game3 = new CS();
        //调用
        Player player = new Player();
        player.happy(game1);
        player.happy(game2);
        player.happy(game3);

    }
}
