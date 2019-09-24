package com.thoughtworks.gambler;

public class GamblerHandler
{
    public static void main(String[] args)
    {
        Player player=new Player(10,12,15);

        GamblerImpl gambler=new GamblerImpl(player);
        gambler.getCountOfWins();
        gambler.getResult();
    }
}
