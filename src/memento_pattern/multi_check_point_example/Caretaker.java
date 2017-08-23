package memento_pattern.multi_check_point_example;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/8/23.
 */
public class Caretaker {

    private Originator o;
    private Vector mementos = new Vector();
    private int current;

    public Caretaker(Originator o) {
        this.o = o;
        current = 0;
    }

    //创建一个新的检查点
    public int createMemento() {
        Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }

    public void restoreMemento(int index) {
        Memento memento = (Memento) mementos.elementAt(index);

        o.restoreMemento(memento);
    }

    //将某个检查点删除
    public void removeMemento(int index) {
        mementos.removeElementAt(index);
    }

}
