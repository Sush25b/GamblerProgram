package com.thoughtworks.gambler;

class Casino {
    private int bets = 0;
    private int wins = 0;
    private int trailCount = 0;
    int cash = 0;
    private Gambler gambler;

    Casino(Gambler gambler) {
        this.gambler = gambler;
    }

    int getCountOfWins() {

        while (gambler.isTrailAvailable()) {
            trailCount++;
            cash = gambler.getStake();
            while (gambler.isStackAvailable(cash)) {
                bets++;
                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }

            if (gambler.checkGoal(cash)) {
                wins++;
            }
        }
        return wins;
    }


    void getResult() {
        System.out.println(wins + " wins of " + trailCount);
        System.out.println("Percent of games won = " + 100.0 * wins / trailCount);
        System.out.println("Avg # bets           = " + 1.0 * bets / trailCount);
    }
}

