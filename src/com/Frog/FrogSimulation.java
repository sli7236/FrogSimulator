package com.Frog;

public class FrogSimulation {
    private int dist;
    private int numHops;
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

    public FrogSimulation(int dist, int numHops) {
        this.dist = dist;
        this.numHops = numHops;
    }

    public boolean simulate() {
        int position = 0;
        for (int count = 0; count < numHops; count++) {
            position += hopDistance();
            if (position >= dist) {
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

    private int hopDistance()
    {
        int hop = testHops[nextHopIndex];
        nextHopIndex++;
        if (nextHopIndex >= testHops.length)
            nextHopIndex = 0;

        return hop;
    }


}
