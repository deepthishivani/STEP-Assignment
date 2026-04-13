package week_7_8.level2;

import java.util.*;

public class problem_12 {

    public static int[] generate(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }

        return arr;
    }

    public static void stats(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;

        for (int i : arr) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        System.out.println("Avg: " + (sum / arr.length));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        int[] arr = generate(5);
        stats(arr);
    }
}