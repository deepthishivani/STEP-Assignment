package week_9_10.level1;

import java.util.Scanner;

public class problem9 {

    public static String toUpper(String text) {

        String result = "";

        for(int i=0;i<text.length();i++) {

            char ch = text.charAt(i);

            if(ch>='a' && ch<='z')
                ch=(char)(ch-32);

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String custom = toUpper(text);
        String built = text.toUpperCase();

        System.out.println(custom);
        System.out.println(custom.equals(built));
    }
}