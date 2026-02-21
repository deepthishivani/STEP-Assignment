package week_1_2.level2;
import java.util.*;
public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
        }

        sc.close();
    }
}