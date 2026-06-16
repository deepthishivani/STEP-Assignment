package week_9_10.level2;

import java.util.Scanner;

public class problem_4 {
    public static String[] splitWords(String text) {
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;
        return words;
    }

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (findLength(words[i]) < findLength(shortest)) shortest = words[i];
            if (findLength(words[i]) > findLength(longest)) longest = words[i];
        }

        System.out.println("Shortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        findShortestLongest(words);
    }
}