package week_3_4.level2;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Greatest factor is 1");
            sc.close();
            return;
        }

        int greatestFactor = 1;
        int counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor is " + greatestFactor);
        sc.close();
    }
}