package StrategyPattern.AnimalPlay;

public class Main {

    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("StrategyPattern.AnimalPlay.Dog: " + sparky.tryToFly());
        System.out.println("StrategyPattern.AnimalPlay.Bird: " + tweety.tryToFly());

        sparky.setFlyingType(new ItFlies());
        System.out.println("StrategyPattern.AnimalPlay.Dog: " + sparky.tryToFly());
    }
}
