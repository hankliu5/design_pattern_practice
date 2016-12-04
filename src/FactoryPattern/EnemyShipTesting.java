package FactoryPattern;

import java.util.Scanner;

/**
 * Created by hankliu on 12/3/16.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U/R/B)");

        if(userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            enemyShip = shipFactory.makeEnemyShip(typeOfShip);
        }

        /* bad design here because put too many if-statements here.

        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }

        if (enemyShipOption.equals("U")) {
            enemyShip = new UFOEnemyShip();
        } else if (enemyShipOption.equals("R")) {
            enemyShip = new RocketEnemyShip();
        } else {
            System.out.println("Use U or R.");
            return;
        }
        */
        if (enemyShip != null) doStuffEnemy(enemyShip);
        else System.out.println("Use U/R/B next time");
    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
