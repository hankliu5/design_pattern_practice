package TemplatePattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class VeggieHoagie extends Hoagie {
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Bell Peppers"};
    String[] condimentUsed = {"Oil", "Vinegar"};

    @Override
    boolean wantMeat() {
        return false;
    }

    @Override
    boolean wantCheese() {
        return false;
    }

    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
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
