package AdapterPattern;

import java.util.Random;

/**
 * Created by hankliu on 12/4/16.
 */
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands.");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " Spaces.");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
