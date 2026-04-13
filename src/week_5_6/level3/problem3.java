package week_5_6.level3;

import java.util.Scanner;

public class problem3 {

    public static int getDayOfWeek(int d, int m, int y) {
        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return h;
    }

    public static String getDayName(int h) {
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int dayNumber = getDayOfWeek(day, month, year);
        System.out.println(getDayName(dayNumber));
    }
}