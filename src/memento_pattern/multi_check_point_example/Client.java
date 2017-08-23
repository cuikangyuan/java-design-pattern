package memento_pattern.multi_check_point_example;

/**
 * Created by cuikangyuan on 2017/8/23.
 */
public class Client {

    private static Originator originator = new Originator();
    private static Caretaker caretaker = new Caretaker(originator);

    public static void main(String[] args) {
        //改变状态
        originator.setState("state 0");
        //建立一个检查点
        caretaker.createMemento();
        //originator.printState();
        //改变状态
        originator.setState("state 1");
        caretaker.createMemento();
        //originator.printState();
        //改变状态
        originator.setState("state 2");
        caretaker.createMemento();
        //originator.printState();
        //改变状态
        originator.setState("state 3");
        caretaker.createMemento();
        //originator.printState();
        //改变状态
        originator.setState("state 4");
        caretaker.createMemento();
        //打印所有检查点
        originator.printState();
        //恢复到第二个检查点
        System.out.println("恢复到第二个检查点 ");
        caretaker.restoreMemento(2);
        //打印所有检查点
        originator.printState();
    }
}
