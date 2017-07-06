package observer_pattern.java_observer_example;

import java.util.Observable;

/**
 * Created by cuikangyuan on 2017/7/6.
 */
public class Watched extends Observable {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data = "";

    public void changeData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();
        }

        notifyObservers();
    }
}
