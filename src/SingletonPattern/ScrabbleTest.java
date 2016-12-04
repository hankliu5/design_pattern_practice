package SingletonPattern;

import java.util.LinkedList;

/**
 * Created by hankliu on 12/4/16.
 */
public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getFirstInstance();
        System.out.println("Instance 1 ID: " + System.identityHashCode(instanceOne));
        System.out.println(instanceOne.getLetterList());
        LinkedList<String> playerOneTiles = instanceOne.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println(instanceOne.getLetterList());

        Singleton instanceTwo = Singleton.getFirstInstance();
        System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
        System.out.println(instanceTwo.getLetterList());
        LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
        System.out.println("Player 2: " + playerTwoTiles);
        System.out.println(instanceTwo.getLetterList());

    }
}
