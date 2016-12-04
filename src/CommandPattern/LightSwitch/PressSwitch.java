package CommandPattern.LightSwitch;

import java.util.Scanner;

/**
 * Created by hankliu on 12/4/16.
 */
public class PressSwitch {
    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        Switch mySwitch = new Switch();
        Scanner scnr = new Scanner(System.in);
        String userInput = "";

        System.out.println("What would you like to do? (ON/OFF)");

        if (scnr.hasNextLine()) userInput = scnr.nextLine();

        if (userInput.equals("ON")) mySwitch.storeAndExecute(switchUp);
        else if (userInput.equals("OFF")) mySwitch.storeAndExecute(switchDown);
        else System.out.println("Press ON or OFF");
    }
}
