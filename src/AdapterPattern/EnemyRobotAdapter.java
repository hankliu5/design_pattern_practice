package AdapterPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        this.robot = newRobot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        robot.reactToHuman(driver);
    }
}
