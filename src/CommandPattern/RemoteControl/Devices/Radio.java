package CommandPattern.RemoteControl.Devices;

/**
 * Created by hankliu on 12/4/16.
 */
public class Radio implements ElectronicDevice {
    private int volume = 0;
    @Override
    public void on() {
        System.out.println("Radio is ON.");
    }

    @Override
    public void off() {
        System.out.println("Radio is OFF.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio volume is at " + ++volume);
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio is volume is at " + --volume);
    }

}
