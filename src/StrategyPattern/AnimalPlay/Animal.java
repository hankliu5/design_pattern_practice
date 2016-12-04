package StrategyPattern.AnimalPlay;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Fly flyingType;

    public void setName(String newName) { name = newName; }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Fly newFlyType) {
        flyingType = newFlyType;
    }
}