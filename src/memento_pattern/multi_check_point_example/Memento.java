package memento_pattern.multi_check_point_example;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/8/23.
 * 备忘录对象
 */
public class Memento {

    private Vector states;
    private int index;

    public Memento(Vector states, int index) {
        this.states = (Vector) states.clone();
        this.index = index;
    }

    public Vector getStates() {
        return this.states;
    }

    public int getIndex() {
        return this.index;
    }
}
