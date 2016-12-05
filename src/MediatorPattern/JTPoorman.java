package MediatorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class JTPoorman extends Colleague {

    public JTPoorman(Mediator newMediator) {
        super(newMediator);
        System.out.println("JT Poorman signed up for the exchange\n");
    }
}