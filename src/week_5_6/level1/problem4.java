package week_5_6.level1;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        int index = 0;

        while (true) {
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        double sum = 0.0;
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        System.out.println("Total = " + sum);
        sc.close();
    }
}