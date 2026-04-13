package week_7_8.level3;

import java.util.Scanner;

public class problem7 {

    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 9000) + 1000;
            data[i][1] = (int)(Math.random() * 90000) + 10000;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][1];
            double bonusRate;

            if (salary < 20000) bonusRate = 0.10;
            else if (salary < 50000) bonusRate = 0.07;
            else bonusRate = 0.05;

            result[i][0] = salary * bonusRate;
            result[i][1] = salary + result[i][0];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] data = generateEmployeeData(n);
        double[][] result = calculateBonus(data);

        for (int i = 0; i < n; i++) {
            System.out.println("Employee ID: " + data[i][0]);
            System.out.println("Old Salary: " + data[i][1]);
            System.out.println("Bonus: " + result[i][0]);
            System.out.println("New Salary: " + result[i][1]);
        }
    }
}