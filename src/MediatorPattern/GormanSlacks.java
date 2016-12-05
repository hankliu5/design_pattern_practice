package MediatorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class GormanSlacks extends Colleague {

    public GormanSlacks(Mediator newMediator) {
        super(newMediator);
        System.out.println("Gorman Slacks signed up for the exchange\n");
    }
}
