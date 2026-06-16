package week_9_10.level1;

import java.util.Scanner;

public class problem7 {

    public static void handle(String text) {

        try {
            int value = Integer.parseInt(text);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handle(text);
    }
}