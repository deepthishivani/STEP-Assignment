package week_5_6.level2;

import java.util.Scanner;

public class problem_9 {

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

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            double physics = sc.nextDouble();
            double chemistry = sc.nextDouble();
            double maths = sc.nextDouble();

            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = getGrade(percentage[i]);
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                    ": Physics = " + marks[i][0] +
                    ", Chemistry = " + marks[i][1] +
                    ", Maths = " + marks[i][2] +
                    ", Percentage = " + percentage[i] +
                    ", Grade = " + grade[i]);
        }

        sc.close();
    }
}