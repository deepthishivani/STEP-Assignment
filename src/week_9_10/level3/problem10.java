package week_9_10.level3;

import java.util.Scanner;

public class problem10 {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int)(Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int cards, int players) {
        if (cards % players != 0) {
            return null;
        }

        int cardsPerPlayer = cards / players;
        String[][] distributed = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }

        return distributed;
    }

    public static void display(String[][] distributed) {
        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i + 1) + ":");

            for (int j = 0; j < distributed[i].length; j++) {
                System.out.println(distributed[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of cards: ");
        int cards = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[][] distributed = distributeCards(deck, cards, players);

        if (distributed == null || cards > 52) {
            System.out.println("Cards cannot be distributed equally.");
        } else {
            display(distributed);
        }
    }
}