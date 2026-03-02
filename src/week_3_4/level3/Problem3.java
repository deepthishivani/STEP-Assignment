package level3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double phy = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chem = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();

        double total = phy + chem + maths;
        double avg = total / 3.0;
        double percentage = avg;

        char grade;
        String remarks;

        if (percentage >= 80) { grade = 'A'; remarks = "Level 4, above agency-normalized standards"; }
        else if (percentage >= 70) { grade = 'B'; remarks = "Level 3, at agency-normalized standards"; }
        else if (percentage >= 60) { grade = 'C'; remarks = "Level 2, below, but approaching agency-normalized standards"; }
        else if (percentage >= 50) { grade = 'D'; remarks = "Level 1, well below agency-normalized standards"; }
        else if (percentage >= 40) { grade = 'E'; remarks = "Level 1-, too below agency-normalized standards"; }
        else { grade = 'R'; remarks = "Remedial standards"; }

        System.out.println("\n--- Result ---");
        System.out.printf("Total Marks: %.2f%n", total);
        System.out.printf("Average Mark: %.2f%n", avg);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}