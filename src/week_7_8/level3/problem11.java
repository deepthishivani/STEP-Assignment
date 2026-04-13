package week_7_8.level3;

import java.util.Scanner;

public class problem11 {

    public static int[][] generateScores(int players) {
        int[][] scores = new int[players][5];

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < 5; j++) {
                scores[i][j] = (int)(Math.random() * 101);
            }
        }
        return scores;
    }

    public static int[] totals(int[][] scores) {
        int[] total = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < 5; j++) {
                total[i] += scores[i][j];
            }
        }
        return total;
    }

    public static double[] averages(int[] totals) {
        double[] avg = new double[totals.length];
        for (int i = 0; i < totals.length; i++) {
            avg[i] = totals[i] / 5.0;
        }
        return avg;
    }

    public static int maxIndex(double[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[idx]) idx = i;
        }
        return idx;
    }

    public static int minIndex(double[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[idx]) idx = i;
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();

        int[][] scores = generateScores(players);
        int[] totals = totals(scores);
        double[] avg = averages(totals);

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + " Total: " + totals[i] + " Average: " + avg[i]);
        }

        System.out.println("Best Player: " + (maxIndex(avg) + 1));
        System.out.println("Worst Player: " + (minIndex(avg) + 1));
    }
}