package com.thoughtworks.gambler;

public class Player {
    private int stake;
    private int goal;
    private int trails;


    public Player(int stake, int goal, int trials) {
        this.stake = stake;
        this.goal = goal;
        this.trails = trials;
    }

    public boolean checkGoal(int cash)
    {
        return (cash == goal) ? true : false;
    }

    public boolean isTrailAvailable()
    {
        if (trails > 0)
        {
            trails--;
            return true;
        }
        return false;
    }

    public int getStake() {
        return stake;
    }

    public boolean isStackAvailable(int cash) {
        return (cash > 0 && cash < goal) ? true : false;
    }
}
