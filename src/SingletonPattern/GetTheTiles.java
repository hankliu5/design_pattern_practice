package SingletonPattern;

import java.util.LinkedList;

/**
 * Created by hankliu on 12/4/16.
 */
public class GetTheTiles implements Runnable{
    @Override
    public void run() {
        Singleton instanceOne = Singleton.getFirstInstance();
        System.out.println("Instance 1 ID: " + System.identityHashCode(instanceOne));
        System.out.println(instanceOne.getLetterList());
        LinkedList<String> playerOneTiles = instanceOne.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println(instanceOne.getLetterList());
        System.out.println("Got Tiles");
    }
}
