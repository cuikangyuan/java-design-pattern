package command_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/7/12.
 */
public class Invocker {

    private Command command;

    public Invocker(Command command) {
        this.command = command;
    }

    public void action() {
        if (command != null) {
            command.execute();
        }
    }
}
