package week_1_2.level3;
import java.util.Scanner;
public class problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter fromCity: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter viaCity: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter toCity: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToViaMiles = sc.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalMiles = sc.nextDouble();
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();
        System.out.print("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();
        double totalKm = (fromToViaMiles + viaToFinalMiles) * 1.60934;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity +
                " to " + toCity + " via " + viaCity + " is " + totalKm +
                " km and the Total Time taken is " + totalTime + " minutes");
        sc.close();
    }
}