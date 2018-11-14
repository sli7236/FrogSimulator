package com.Frog;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public int nextHopIndex;
    public int[] testHops;
    int[][] hopSequences =
            {
                    {5, 7, -2, 8, 6},
                    {6, 7, 6, 6},
                    {6, -6, 31},
                    {4, 2, -8},
                    {5, 4, 2, 4, 3}
            };

    public FrogSimulation(int goalDistance, int maxHops) {
        this.goalDistance = goalDistance;
        this.maxHops = maxHops;
    }

    public boolean simulate() {
        int position = 0;
        for (int count = 0; count < maxHops; count++) {
            position += hopDistance();
            if (position >= goalDistance) {
                return true;
            } else if (position < 0)
            {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        int countSuccess = 0;
        for (int count = 0; count < num; count++)
        {
            if(simulate())
            {
                countSuccess++;
            }
        }
        return (double)countSuccess / num;
    }

    public int hopDistance()
    {
        int hops = 0;
        for (int i = 0; i < hopSequences.length; i++)
        {
            for (int x = 0; x < hopSequences[i].length;x++)
            {
                hops += hopSequences[i][x];
            }
        }
        return hops;
    }


}
