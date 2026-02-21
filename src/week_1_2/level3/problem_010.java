package week_1_2.level3;
import java.util.Scanner;
public class problem_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numberOfStudents: ");
        long n = sc.nextLong();
        long handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
        sc.close();
    }
}