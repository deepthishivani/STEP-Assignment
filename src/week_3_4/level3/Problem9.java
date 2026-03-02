package level3;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            sc.close();
            return;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }

        System.out.println(number + (sum > number ? " is an Abundant Number" : " is NOT an Abundant Number"));
        sc.close();
    }
}