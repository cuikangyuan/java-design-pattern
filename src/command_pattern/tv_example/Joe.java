package command_pattern.tv_example;

/**
 * Created by cuikangyuan on 2017/7/12.
 */
public class Joe {

    public static void main(String[] args) {
        Tv tv = new Tv();

        OnCommand onCommand = new OnCommand(tv);
        OffCommand offCommand = new OffCommand(tv);
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(tv);

        Control control = new Control(onCommand, offCommand, changeChannelCommand);

        control.openTv();
        control.closeTv();
        control.changeChanel();

    }
}
