package memento_pattern.white_box_example;

/**
 * Created by cuikangyuan on 2017/8/23.
 * 负责人角色
 *
 * 负责保存备忘录对象
 */
public class Caretaker {
    private Memento memento;

    //备忘录取值方法
    public Memento retrieveMemento() {
        return this.memento;
    }

    //备忘录赋值方法
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
