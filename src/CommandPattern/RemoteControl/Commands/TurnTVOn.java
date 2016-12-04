package CommandPattern.RemoteControl.Commands;

import CommandPattern.RemoteControl.Devices.ElectronicDevice;

/**
 * Created by hankliu on 12/4/16.
 */
public class TurnTVOn implements Command {
    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
