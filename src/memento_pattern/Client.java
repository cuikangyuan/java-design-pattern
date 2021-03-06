package memento_pattern;

import memento_pattern.white_box_example.Caretaker;
import memento_pattern.white_box_example.Originator;

/**
 * Created by cuikangyuan on 2017/7/13.
 */
public class Client {

    private static Originator originator = new Originator();
    private static Caretaker caretaker = new Caretaker();

    public static void main(String[] args) {
        //改变发起人对象状态
        originator.setState("On");
        //创建备忘录对象 将发起人状态保存
        caretaker.saveMemento(originator.createMemento());
        System.out.println("发起人状态保存 " + originator.getState());
        //改变发起人对象状态
        originator.setState("Off");
        System.out.println("手动改变发起人状态： " + originator.getState());
        //恢复发起人当时保存的状态
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("恢复发起人状态： " + originator.getState());
    }
}
