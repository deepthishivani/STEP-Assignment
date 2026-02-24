package week_3_4.level2;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Greatest factor is 1");
            sc.close();
            return;
        }

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor is " + greatestFactor);
        sc.close();
    }
}