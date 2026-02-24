package week_3_4.level2;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100");
            sc.close();
            return;
        }

        int counter = 99;
        while (counter > 0) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }

        sc.close();
    }
}