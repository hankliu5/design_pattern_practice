package TemplatePattern;

/**
 * Created by hankliu on 12/4/16.
 */
public abstract class Hoagie {
    final void makeSandwich() {
        cutBun();
        if (wantMeat()) addMeat();
        if (wantCheese()) addCheese();
        if (wantVegetables()) addVegetables();
        if (wantCondiments()) addCondiments();
        wrapTheHoagie();
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    boolean wantMeat() { return true; }
    boolean wantCheese() { return true; }
    boolean wantVegetables() { return true; }
    boolean wantCondiments() { return true; }

    public void cutBun() {
        System.out.println("The Hoagie is Cut.");
    }

    public void wrapTheHoagie() {
        System.out.println("Wrapped the Hoagie.");
    }



}
