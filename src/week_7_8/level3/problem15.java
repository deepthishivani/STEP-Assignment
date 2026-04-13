package week_7_8.level3;

import java.util.Scanner;

public class problem15 {

    public static int[] generateNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 900) + 100;
        }
        return arr;
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = generateNumbers(n);

        for (int num : arr) {
            System.out.println("Number: " + num);
            System.out.println("Positive: " + isPositive(num));
            System.out.println("Even: " + isEven(num));
            System.out.println("Compare first and last digit: " + compare(num / 100, num % 10));
        }
    }
}