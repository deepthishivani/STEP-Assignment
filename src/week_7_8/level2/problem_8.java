package week_7_8.level2;

import java.util.*;

public class problem_8 {

    public static int min(int[] arr) {
        int m = Integer.MAX_VALUE;
        for (int i : arr) m = Math.min(m, i);
        return m;
    }

    public static int max(int[] arr) {
        int m = Integer.MIN_VALUE;
        for (int i : arr) m = Math.max(m, i);
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextInt();

        System.out.println("Youngest: " + min(age));
        System.out.println("Tallest: " + max(height));
    }
}