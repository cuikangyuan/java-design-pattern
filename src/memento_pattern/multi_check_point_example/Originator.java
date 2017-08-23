package memento_pattern.multi_check_point_example;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/8/23.
 */
public class Originator {

    private Vector states;
    private int index;

    public Originator() {
        states = new Vector();
        index = 0;
    }


    public Memento createMemento() {
        return new Memento(states, index);
    }

    public void restoreMemento(Memento memento) {
        states = memento.getStates();
        index = memento.getIndex();
    }

    public void setState(String state) {
        states.add(state);
        index++;
    }

    public void printState() {
        System.out.println("状态总数 " + index);
        for (Enumeration enumeration = states.elements();
             enumeration.hasMoreElements(); ) {
            System.out.println(enumeration.nextElement());

        }
    }
}
