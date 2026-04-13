package week_5_6.level1;

import java.util.Scanner;

public class problem6 {

    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Enter a natural number");
            return;
        }

        System.out.println("Sum of first " + n + " natural numbers: " + findSumOfNaturalNumbers(n));
    }
}