package observer_pattern.java_observer_example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cuikangyuan on 2017/7/6.
 */
public class Watcher implements Observer{

    public Watcher(Watched watched) {
        watched.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态改变: " + ((Watched)o).getData());
    }
}
