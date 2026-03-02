package level2;

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power should be a non-negative integer");
            sc.close();
            return;
        }

        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result is " + result);
        sc.close();
    }
}