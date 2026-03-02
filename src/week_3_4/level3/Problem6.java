package level3;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int n = Math.abs(number);
        int count = 0;

        if (n == 0) count = 1;
        else {
            while (n != 0) { n /= 10; count++; }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}