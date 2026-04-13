package week_7_8.level3;

import java.util.Scanner;

public class problem8 {

    public static int[][] generateNumbers(int n) {
        int[][] data = new int[n][3];

        for (int i = 0; i < n; i++) {
            int num = (int)(Math.random() * 900) + 100;
            data[i][0] = num;
            data[i][1] = num % 10;
            data[i][2] = num / 100;
        }
        return data;
    }

    public static void compareDigits(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Number: " + data[i][0] + " -> ");
            if (data[i][1] > data[i][2]) {
                System.out.println("Last digit is greater");
            } else if (data[i][1] < data[i][2]) {
                System.out.println("First digit is greater");
            } else {
                System.out.println("Both are equal");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] data = generateNumbers(n);
        compareDigits(data);
    }
}