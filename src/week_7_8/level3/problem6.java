package week_7_8.level3;

import java.util.Scanner;

public class problem6 {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();

        String[] names = new String[persons];
        double[] bmi = new double[persons];

        for (int i = 0; i < persons; i++) {
            names[i] = sc.next();
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            bmi[i] = calculateBMI(weight, height);
        }

        for (int i = 0; i < persons; i++) {
            System.out.println(names[i] + " " + bmi[i] + " " + getStatus(bmi[i]));
        }
    }
}