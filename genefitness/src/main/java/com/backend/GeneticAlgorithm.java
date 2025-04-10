package com.backend;
/**
 * GeneticAlgorithm.java
 * The main driver that sets up and runs the GA.
 */
public class GeneticAlgorithm {
    public static void main(String[] args) {
        int populationSize = 20;
        int chromosomeLength = 10;
        double mutationRate = 0.05;
        int generations = 50;

        if (mutationRate < 0 || mutationRate > 1) {
            throw new IllegalArgumentException("Mutation rate must be between 0 and 1.");
        }

        Population population = new Population(populationSize, chromosomeLength);

        for (int gen = 0; gen < generations; gen++) {
            System.out.println("Generation " + gen + " - Best: " + population.getFittest());
            population.evolve(mutationRate);
        }

        System.out.println("Final best solution: " + population.getFittest());
    }
}

