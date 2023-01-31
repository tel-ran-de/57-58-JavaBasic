package lessons.lesson9.poker.services;

import lessons.lesson9.poker.entity.Card;
import lessons.lesson9.poker.entity.Cards;
import lessons.lesson9.poker.entity.Player;

import java.util.Arrays;

public class CardTable {
    Cards cards = new Cards();

    int numberCardsForEachPlayer = 5;

    public void game() {


        cards.createDeck();
        cards.printDeck("-------- Create new deck-------", cards.deck);

        cards.deckShuffle(cards.deck);
        cards.printDeck("-------- Deck after shuffle-------", cards.deckShuffle);

        cards.deckShuffle(cards.deckShuffle);
        cards.printDeck("-------- Deck after shuffle-------", cards.deckShuffle);

        System.out.println("--------- Game started. Cards in a way ... --------");

        int numberOfPlayers = 4; // должно вводится пользователем через отдельный интерфейс

        Player[] players = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player("Player № "+ (i+1));
        }

        System.out.println("------- Players -----");

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }


        //------- раздача карт --------

        int counter = 0;

        //indexForCardNumberForEachPlayer

        for (int i = 0; i < numberCardsForEachPlayer ; i++) {

            for (int j = 0; j < numberOfPlayers; j++) {

                players[j].playerCards[i] = cards.deckShuffle[counter];
                counter++;
            }
        }

        System.out.println("------- Players with cards-----");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }


        cards.printDeck("-------- Deck players -------", cards.deckShuffle);

        Card emptyCard = new Card("/", "|");

        for (int i = 0; i < numberOfPlayers*numberCardsForEachPlayer; i++) {


            // ============ ЛЮБОЕ ИЗМЕНЕНИЕ ДАННЫХ НА УРОВНЕ ИХ ПЕРВОНАЧАЛЬНЫХ ЗНАЧЕНИЙ
            // ВЛЕЧЕТ ЗА СОБОЙ ИЗМЕНЕНИЯ ВСЕХ ДАННЫХ В ОБЪЕКТАХ ГДЕ ОНИ ИСПОЛЬЗОВАЛИСЬ !!!!!!!!
//            cards.deckShuffle[i].value  = "";
//            cards.deckShuffle[i].suit  = "";

            cards.deckShuffle[i] = emptyCard;
        }


        cards.printDeck("-------- Deck after shuffle-------", cards.deckShuffle);


        System.out.println("------- Players with cards-----");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }

    }
}
