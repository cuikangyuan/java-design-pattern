package memento_pattern.black_box_example;

/**
 * Created by cuikangyuan on 2017/8/23.
 * 负责人角色
 *
 * 负责保存备忘录对象
 */
public class Caretaker {
    private MementoIF memento;

    //备忘录取值方法
    public MementoIF retrieveMemento() {
        return this.memento;
    }

    //备忘录赋值方法
    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
}
