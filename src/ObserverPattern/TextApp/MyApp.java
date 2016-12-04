package ObserverPattern.TextApp;

import java.util.Observable;

/**
 * Created by hankliu on 12/3/16.
 */
public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver((Observable obj, Object arg) -> {
            System.out.println("Received response: " + arg);
        });

        new Thread(eventSource).start();
    }
}
