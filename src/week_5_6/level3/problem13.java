package week_5_6.level3;

import java.util.Scanner;

public class problem13 {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 91) + 10;
        }
        return ages;
    }

    public static String canVote(int age) {
        return age >= 18 ? "Can Vote" : "Cannot Vote";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        for (int age : ages) {
            System.out.println("Age: " + age + " -> " + canVote(age));
        }
    }
}