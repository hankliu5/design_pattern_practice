package CommandPattern.RemoteControl;

import CommandPattern.RemoteControl.Commands.Command;

/**
 * Created by hankliu on 12/4/16.
 */
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }
}
