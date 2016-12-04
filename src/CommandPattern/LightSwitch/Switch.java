package CommandPattern.LightSwitch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hankliu on 12/4/16.
 */
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }
}
