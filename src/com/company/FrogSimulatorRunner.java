package com.company;

public class FrogSimulatorRunner {

    public static void main(String[] args) {
        int[] testHops;
        int nextHopIndex;

        int[][] hopSequences =
        {
            {5, 7, -2, 8, 6},
            {6, 7, 6, 6},
            {6, -6, 31},
            {4, 2, -8},
            {5, 4, 2, 4, 3}
        };

        FrogSimulation sim = new FrogSimulation(24, 5);

        for (int i = 0; i < hopSequences.length; i++)
        {
            sim.testHops = hopSequences[i];
            sim.nextHopIndex = 0;
            int simNum = i+1;
            System.out.println("Simulation # " + simNum + ": " + sim.simulate());
        }

        sim.testHops = hopSequences[0];
        sim.nextHopIndex = 0;
        System.out.println(sim.runSimulations(10));
    }

}
