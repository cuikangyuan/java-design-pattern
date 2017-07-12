package command_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/7/12.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;


    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
