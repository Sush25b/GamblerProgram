package com.thoughtworks.gambler;

public class GamblerHandler {
    public static void main(String[] args) {
        Gambler player = new Gambler(10, 12, 15);

        Casino gambler = new Casino(player);
        gambler.getCountOfWins();
        gambler.getResult();
    }
}
