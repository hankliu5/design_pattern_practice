package CommandPattern.RemoteControl;

import CommandPattern.RemoteControl.Commands.TurnItAllOff;
import CommandPattern.RemoteControl.Commands.TurnTVOff;
import CommandPattern.RemoteControl.Commands.TurnTVOn;
import CommandPattern.RemoteControl.Commands.TurnTVUp;
import CommandPattern.RemoteControl.Devices.ElectronicDevice;
import CommandPattern.RemoteControl.Devices.Radio;
import CommandPattern.RemoteControl.Devices.Television;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hankliu on 12/4/16.
 */
public class PlayWithRemote {
    public static void main(String[] args) {
        ElectronicDevice newDevice = new Television();

        // On
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        // Off
        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        // Volume Up
        TurnTVUp volUpCommand = new TurnTVUp(newDevice);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();

        // Turn it all off
        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        // Undo turn it all off
        turnThemOff.pressUndo();

    }
}
