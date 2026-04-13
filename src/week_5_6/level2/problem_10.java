package week_5_6.level2;

import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        long temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            frequency[digits[i]]++;
            temp /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + frequency[i]);
        }

        sc.close();
    }
}