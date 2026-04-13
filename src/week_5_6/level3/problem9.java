package week_5_6.level3;

import java.util.Scanner;

public class problem9 {

    public static int[] generateNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 900) + 100;
        }
        return arr;
    }

    public static int[] findDigits(int num) {
        int count = 0, temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int num) {
        int[] digits = findDigits(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = findDigits(num);
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, digits.length);
        }
        return sum == num;
    }

    public static int largest(int[] digits) {
        int max = digits[0];
        for (int d : digits) {
            if (d > max) max = d;
        }
        return max;
    }

    public static int secondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static int[] smallestAndLargest(int[] digits) {
        int min = digits[0], max = digits[0];
        for (int d : digits) {
            if (d < min) min = d;
            if (d > max) max = d;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = generateNumbers(n);

        for (int num : nums) {
            int[] digits = findDigits(num);
            int[] sl = smallestAndLargest(digits);

            System.out.println("Number: " + num);
            System.out.println("Duck Number: " + isDuck(num));
            System.out.println("Armstrong Number: " + isArmstrong(num));
            System.out.println("Largest Digit: " + largest(digits));
            System.out.println("Second Largest Digit: " + secondLargest(digits));
            System.out.println("Smallest Digit: " + sl[0]);
            System.out.println("Largest Digit: " + sl[1]);
        }
    }
}