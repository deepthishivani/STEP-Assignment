package level3;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int n = Math.abs(number);
        int sum = 0;
        int temp = n;

        while (temp != 0) { sum += temp % 10; temp /= 10; }

        boolean isHarshad = (sum != 0) && (n % sum == 0);
        System.out.println(number + (isHarshad ? " is a Harshad Number" : " is NOT a Harshad Number"));

        sc.close();
    }
}