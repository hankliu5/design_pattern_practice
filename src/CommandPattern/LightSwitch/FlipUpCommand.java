package CommandPattern.LightSwitch;

/**
 * Created by hankliu on 12/4/16.
 */
public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
