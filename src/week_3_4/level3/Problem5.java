package level3;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        System.out.println(number + (sum == number ? " is an Armstrong Number" : " is NOT an Armstrong Number"));
        sc.close();
    }
}