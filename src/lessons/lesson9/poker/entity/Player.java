package lessons.lesson9.poker.entity;

import java.util.Arrays;

public class Player {
    public String name;
    public Card[] playerCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", playerCards=" + Arrays.toString(playerCards) +
                '}';
    }
}
