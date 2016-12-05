package TemplatePattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class ItalianHoagie extends Hoagie{
    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Bell Peppers"};
    String[] condimentUsed = {"Oil", "Vinegar"};

    @Override
    void addMeat() {
        System.out.print("Adding the Meat: ");
        for(String meat : meatUsed) System.out.print(meat + " ");
        System.out.println();
    }

    @Override
    void addCheese() {
        System.out.print("Adding the Cheese: ");
        for(String cheese : cheeseUsed) System.out.print(cheese + " ");
        System.out.println();

    }

    @Override
    void addVegetables() {
        System.out.print("Adding the Veggies: ");
        for(String veggie : veggiesUsed) System.out.print(veggie + " ");
        System.out.println();

    }

    @Override
    void addCondiments() {
        System.out.print("Adding the Condiments: ");
        for(String condiment : condimentUsed) System.out.print(condiment + " ");
        System.out.println();

    }
}
