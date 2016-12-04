package ObserverPattern.Wiki;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by hankliu on 12/3/16.
 */
public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        while (true) {
            String response = new Scanner(System.in).nextLine();
            setChanged();
            notifyObservers(response);
        }
    }
}
