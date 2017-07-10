package iterator_pattern.cop_example;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public abstract class Purchase {

    private Vector elements = new Vector(3);

    public abstract Iterator createIterator();

    public void append(Object o) {
        elements.addElement(o);
    }

    public void remove(Object o) {
        elements.removeElement(o);
    }

    public Object currentItem(int i) {
        return elements.get(i);
    }

    public int count() {
        return elements.size();
    }
}
