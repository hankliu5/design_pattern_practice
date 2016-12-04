package DecoratorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tomato Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}

