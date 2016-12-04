package CommandPattern.RemoteControl.Commands;

/**
 * Created by hankliu on 12/4/16.
 */
public interface Command {
    public void execute();
    public void undo();
}
