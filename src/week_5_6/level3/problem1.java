package week_5_6.level3;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();

        if (number < 0) {
            System.out.println("Enter a non-negative number");
            sc.close();
            return;
        }

        long temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;

        if (number == 0) {
            digits[0] = 0;
            frequency[0] = 1;
        } else {
            int index = 0;
            while (temp != 0) {
                digits[index] = (int)(temp % 10);
                frequency[digits[index]]++;
                temp /= 10;
                index++;
            }
        }

        System.out.println("Digits in the number:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

        sc.close();
    }
}