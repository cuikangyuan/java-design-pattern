package command_pattern.tv_example;

/**
 * Created by cuikangyuan on 2017/7/12.
 */
public class ChangeChannelCommand implements Command {

    private Tv tv;

    public ChangeChannelCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
