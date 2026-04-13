package week_7_8.level2;

import java.util.*;

public class problem_10 {

    public static double bmi(double w, double h_cm) {
        double h = h_cm / 100;
        return w / (h * h);
    }

    public static String status(double b) {
        if (b < 18.5) return "Underweight";
        else if (b < 25) return "Normal";
        else if (b < 40) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            double b = bmi(w, h);
            System.out.println(b + " " + status(b));
        }
    }
}