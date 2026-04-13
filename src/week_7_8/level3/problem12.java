package week_7_8.level3;

import java.util.Scanner;

public class problem12 {

    public static int[][] generateNumbers(int n) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (int)(Math.random() * 900) + 100;
            arr[i][1] = (int)(Math.random() * 900) + 100;
        }
        return arr;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] nums = generateNumbers(n);

        for (int i = 0; i < n; i++) {
            int a = nums[i][0];
            int b = nums[i][1];
            System.out.println("Numbers: " + a + ", " + b);
            System.out.println("GCD: " + gcd(a, b));
            System.out.println("LCM: " + lcm(a, b));
        }
    }
}