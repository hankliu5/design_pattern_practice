package SingletonPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class ScrabbleTestThreads {
    public static void main(String[] args) {
        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();
        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

    }
}
