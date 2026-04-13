package week_7_8.level2;

import java.util.Scanner;

public class problem_11 {

    public static void solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(r1 + " " + r2);
        } else if (d == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println("No real roots");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    }
}