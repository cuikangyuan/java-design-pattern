package command_pattern.tv_example;

/**
 * Created by cuikangyuan on 2017/7/12.
 */
public class OnCommand implements Command {

    private Tv tv;

    public OnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
