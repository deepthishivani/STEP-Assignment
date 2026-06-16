package week_9_10.level1;

import java.util.Arrays;
import java.util.Scanner;

public class problem3 {

    public static char[] getCharacters(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    public static boolean compare(char[] a, char[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] custom = getCharacters(text);
        char[] built = text.toCharArray();

        System.out.println(Arrays.toString(custom));
        System.out.println(compare(custom, built));
    }
}