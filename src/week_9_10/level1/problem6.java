package week_9_10.level1;

import java.util.Scanner;

public class problem6 {

    public static void handle(String text) {

        try {
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handle(text);
    }
}