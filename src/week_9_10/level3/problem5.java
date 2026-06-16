package week_9_10.level3;

import java.util.Scanner;

public class problem5 {
    public static char[] findUniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean exists = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                temp[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] findFrequency(String text, char[] unique) {
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (unique[i] == text.charAt(j)) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }

        return result;
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

        char[] unique = findUniqueCharacters(text);
        String[][] result = findFrequency(text, unique);

        display(result);
    }
}