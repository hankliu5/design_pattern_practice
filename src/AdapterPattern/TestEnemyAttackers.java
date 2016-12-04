package AdapterPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class TestEnemyAttackers {
    public static void main(String[] args) {
        EmemyTank rx7 = new EmemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The Tank");
        rx7.assignDriver("Frank");
        rx7.driveForward();
        rx7.fireWeapon();

        System.out.println("Robot with Adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
