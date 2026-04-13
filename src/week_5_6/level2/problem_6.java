package week_5_6.level2;

import java.util.Scanner;

public class problem_6 {

    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input, enter again");
                i--;
                continue;
            }
        }

        for (int i = 0; i < number; i++) {
            double heightMeter = height[i] / 100.0;
            bmi[i] = weight[i] / (heightMeter * heightMeter);
            status[i] = getStatus(bmi[i]);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height = " + height[i] +
                    ", Weight = " + weight[i] +
                    ", BMI = " + bmi[i] +
                    ", Status = " + status[i]);
        }

        sc.close();
    }
}