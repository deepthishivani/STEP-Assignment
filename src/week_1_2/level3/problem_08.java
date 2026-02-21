package week_1_2.level3;
import java.util.Scanner;
public class problem_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100.0;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " +
                principal + ", Rate of Interest " + rate + " and Time " + time);
        sc.close();
    }
}