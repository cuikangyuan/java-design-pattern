package observer_pattern.demo2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/7/5.
 */
public class ConcreteSubject extends Subject {

    private String state;

    public void changeState(String newState) {
        this.state = newState;
        notifyObservers();
    }


}
