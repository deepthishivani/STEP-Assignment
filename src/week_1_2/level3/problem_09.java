package week_1_2.level3;

import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (pounds): ");
        double weight = sc.nextDouble();

        double kg = weight * 2.2;

        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + kg);
        sc.close();
    }
}
