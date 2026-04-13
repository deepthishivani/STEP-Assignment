package week_7_8.level3;

import java.util.Scanner;

public class problem1 {

    public static double meanHeight(double[] heights) {
        double sum = 0;
        for (double h : heights) sum += h;
        return sum / heights.length;
    }

    public static double shortest(double[] heights) {
        double min = heights[0];
        for (double h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static double tallest(double[] heights) {
        double max = heights[0];
        for (double h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
        System.out.println("Mean height: " + meanHeight(heights));
    }
}