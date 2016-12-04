package CommandPattern.RemoteControl.Commands;

import CommandPattern.RemoteControl.Devices.ElectronicDevice;

/**
 * Created by hankliu on 12/4/16.
 */
public class TurnTVOff implements Command{
    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
