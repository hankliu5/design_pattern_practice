package MediatorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public interface Mediator {
    void saleOffer(String stock, int shares, int collCode);
    void buyOffer(String stock, int shares, int collCode);
    void addColleague(Colleague colleague);
}
