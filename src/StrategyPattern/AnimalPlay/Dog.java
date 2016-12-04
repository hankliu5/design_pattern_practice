package StrategyPattern.AnimalPlay;

/**
 * Created by hankliu on 11/28/16.
 */
public class Dog extends Animal {
    public void digHole() {
        System.out.println("Dig a hole.");
    }

    public Dog() {
        super();

        setSound("Bark");
        flyingType = new CantFly();
    }
}
