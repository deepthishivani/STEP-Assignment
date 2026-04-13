package week_5_6.level2;

import java.util.Scanner;

public class problem_7 {

    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input, enter again");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < number; i++) {
            double heightMeter = personData[i][1] / 100.0;
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);
            weightStatus[i] = getStatus(personData[i][2]);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Weight = " + personData[i][0] +
                    ", Height = " + personData[i][1] +
                    ", BMI = " + personData[i][2] +
                    ", Status = " + weightStatus[i]);
        }

        sc.close();
    }
}