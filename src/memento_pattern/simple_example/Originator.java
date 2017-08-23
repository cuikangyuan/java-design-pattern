package memento_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/8/23.
 * 发起角色
 */
public class Originator {

    private String state;

    //工厂方法 返还一个新的备忘录对象
    public Memento createMemento () {
        return new Memento(state);
    }

    //将发起人恢复到备忘录对象的状态
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    //状态的获取 和 赋值方法
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
