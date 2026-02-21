package week_1_2.level2;


import java.util.*;

public class problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double r1 = a + b * c;
        double r2 = a * b + c;

        System.out.print("The results of Double Operations are " + r1 + ", " + r2 + ", ");

        if (b == 0.0) {
            System.out.println("undefined, and undefined (division/mod by zero)");
        } else {
            double r3 = c + a / b;
            double r4 = a % b + c;
            System.out.println(r3 + ", and " + r4);
        }

        sc.close();
    }
}