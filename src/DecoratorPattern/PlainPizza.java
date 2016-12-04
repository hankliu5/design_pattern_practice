package DecoratorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class PlainPizza implements Pizza {
    @Override
    public double getCost() {
        return 4.00;
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }
}
