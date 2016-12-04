package StrategyPattern.AnimalPlay;

/**
 * Created by hankliu on 11/28/16.
 */
public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlies();
    }
}
