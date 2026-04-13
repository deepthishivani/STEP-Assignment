package week_7_8.level2;

import java.util.Scanner;

public class problem_7 {

    public static boolean canVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println(canVote(ages[i]));
        }
    }
}