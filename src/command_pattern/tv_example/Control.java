package command_pattern.tv_example;

/**
 * Created by cuikangyuan on 2017/7/12.
 */
public class Control {

    private Command onCommand, offCommand, changeChanelCommand;

    public Control(Command onCommand, Command offCommand, Command changeChanelCommand) {

        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.changeChanelCommand = changeChanelCommand;
    }

    public void openTv(){
        onCommand.execute();
    }

    public void closeTv(){
        offCommand.execute();
    }

    public void changeChanel() {
        changeChanelCommand.execute();
    }
}
