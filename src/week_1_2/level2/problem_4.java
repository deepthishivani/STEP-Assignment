package week_1_2.level2;
import java.util.*;
public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        sc.close();
    }
}