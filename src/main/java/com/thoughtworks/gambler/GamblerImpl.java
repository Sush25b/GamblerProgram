package com.thoughtworks.gambler;

public class GamblerImpl
{
    private int bets=0;
    private int wins=0;
    private int trailCount=0;

    private Player player;

    public GamblerImpl(Player player)
    {
        this.player = player;
    }

    public int getCountOfWins()
    {
           int cash=0;

           while(player.isTrailAvailable())
           {
               trailCount++;
               cash= player.getStake();
               //operation
                while ( player.isStackAvailable(cash) )
                {
//                    System.out.println(cash+"   "+bets+" "+wins);
                    bets++;
                    if (Math.random() < 0.5)
                        cash++;
                    else
                        cash--;
                }

                if ( player.checkGoal(cash) )
                {
                    wins++;
                }
           }
//           System.out.println("final"+cash+"   "+bets+" "+wins);
           return wins;
    }


    public void getResult()
    {
        System.out.println(wins + " wins of " + trailCount);
        System.out.println("Percent of games won = " + 100.0 * wins / trailCount);
        System.out.println("Avg # bets           = " + 1.0 * bets / trailCount);
    }
}

