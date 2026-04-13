package week_5_6.level2;

import java.util.Scanner;

public class problem_8 {

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grade[i] = getGrade(percentage[i]);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                    ": Physics = " + physics[i] +
                    ", Chemistry = " + chemistry[i] +
                    ", Maths = " + maths[i] +
                    ", Percentage = " + percentage[i] +
                    ", Grade = " + grade[i]);
        }

        sc.close();
    }
}