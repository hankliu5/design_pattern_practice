package CommandPattern.RemoteControl.Commands;

import CommandPattern.RemoteControl.Devices.ElectronicDevice;

/**
 * Created by hankliu on 12/4/16.
 */
public class TurnTVUp implements Command {
    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
