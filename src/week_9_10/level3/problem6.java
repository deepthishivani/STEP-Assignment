package week_9_10.level3;

import java.util.Scanner;

public class problem6 {
    public static String[][] findFrequencyUsingNestedLoops(String text) {
        char[] characters = text.toCharArray();
        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') continue;

            int count = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                    characters[j] = '0';
                }
            }

            result[index][0] = String.valueOf(characters[i]);
            result[index][1] = String.valueOf(count);
            index++;
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void display(String[][] result) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = findFrequencyUsingNestedLoops(text);
        display(result);
    }
}