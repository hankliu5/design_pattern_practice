package AdapterPattern;

import java.util.Random;

/**
 * Created by hankliu on 12/4/16.
 */
public class EmemyTank implements EnemyAttacker {
    Random generator = new Random();
    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage.");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces.");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println(driver + " is driving the tank.");
    }
}
