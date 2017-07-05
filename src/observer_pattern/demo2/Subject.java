package observer_pattern.demo2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/7/5.
 * 抽象主题角色
 */
public abstract class Subject {

    private Vector observers = new Vector();


    public void attach(Observer observer) {
        observers.addElement(observer);
    }

    public void detach(Observer observer) {
        observers.removeElement(observer);
    }

    public void notifyObservers() {
        Enumeration enumeration = observers();

        while (enumeration.hasMoreElements()) {
            ((Observer)enumeration.nextElement()).update();
        }
    }

    public Enumeration observers() {
        return ((Vector)observers.clone()).elements();
    }
}
