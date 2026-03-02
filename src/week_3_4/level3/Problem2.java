package level3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid year (works only for year >= 1582)");
        } else {
            boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            System.out.println(year + (isLeap ? " is a Leap Year" : " is NOT a Leap Year"));
        }
        sc.close();
    }
}