package CommandPattern.LightSwitch;

/**
 * Created by hankliu on 12/4/16.
 */
public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }

}
