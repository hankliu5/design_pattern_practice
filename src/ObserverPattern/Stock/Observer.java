package ObserverPattern.Stock;

/**
 * Created by hankliu on 12/3/16.
 */
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
