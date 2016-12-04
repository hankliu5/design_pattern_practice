package DecoratorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }

}
