package week_7_8.level3;

import java.util.Scanner;

public class problem2 {

    public static int[][] generateScores(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 41) + 60;
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][2];

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) total += marks[i][j];
            result[i][0] = total;
            result[i][1] = total / 3.0;
        }
        return result;
    }

    public static char getGrade(double avg) {
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] marks = generateScores(students);
        double[][] results = calculateResults(marks);

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Total: " + (int)results[i][0]);
            System.out.println("Average: " + results[i][1]);
            System.out.println("Grade: " + getGrade(results[i][1]));
        }
    }
}