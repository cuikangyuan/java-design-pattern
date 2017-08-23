package memento_pattern.white_box_example;

/**
 * Created by cuikangyuan on 2017/8/23.
 * 备忘录对象
 */
public class Memento {

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
