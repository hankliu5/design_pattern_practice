package CommandPattern.RemoteControl.Commands;

import CommandPattern.RemoteControl.Devices.ElectronicDevice;

import java.util.List;

/**
 * Created by hankliu on 12/4/16.
 */
public class TurnItAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : theDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : theDevices) {
            device.on();
        }
    }
}
