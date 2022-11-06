package task_2;

import java.util.*;

public class Subtask9 {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.start(3);
    }
    public static class Poker {
        private List<String> suits = new ArrayList<>();
        private List<String> ranks = new ArrayList<>();
        private List<String> cards = new ArrayList<>();

        {
            suits.add("Spades");
            suits.add("Clubs");
            suits.add("Diamonds");
            suits.add("Hearts");

            ranks.add("A");
            ranks.add("K");
            ranks.add("Q");
            ranks.add("J");
            ranks.add("10");
            ranks.add("9");
            ranks.add("8");
            ranks.add("7");
            ranks.add("6");
            ranks.add("5");
            ranks.add("4");
            ranks.add("3");
            ranks.add("2");

            for(String suit : suits) {
                for(String rank : ranks) {
                    cards.add(suit + " " + rank);
                }
            }
        }

        public void start(int num) {
            Collections.shuffle(cards);
            for(int i = 0; i < num; i++) {
                System.out.printf("Player %d: ", i + 1);
                System.out.println();
                for(int j = 0; j < 5; j++) {
                    String card = cards.stream().findAny().get();
                    cards.remove(card);

                    System.out.print(card + ", ");
                }
                System.out.println();
            }
        }
    }
}
