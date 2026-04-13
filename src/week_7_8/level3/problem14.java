package week_7_8.level3;
import java.util.Scanner;

public class problem14 {

    public static int[] generateHeights(int n) {
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = (int)(Math.random() * 101) + 100;
        }
        return h;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] heights = generateHeights(n);

        System.out.println("Sum: " + sum(heights));
        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}