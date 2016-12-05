package TemplatePattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class SandwichSculptor {
    public static void main(String[] args) {
        Hoagie hoagie1 = new ItalianHoagie();
        hoagie1.makeSandwich();

        Hoagie hoagie2 = new VeggieHoagie();
        hoagie2.makeSandwich();
    }
}
