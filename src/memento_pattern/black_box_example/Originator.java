package memento_pattern.black_box_example;

/**
 * Created by cuikangyuan on 2017/8/23.
 * 发起角色
 *
 * 有一个内部类 Memento (所有方法都是private 窄接口)
 * 对外只提供 MementoIF所暴露的方法(宽接口)
 */
public class Originator {

    private String state;

    //工厂方法 返还一个新的备忘录对象
    public MementoIF createMemento () {
        return new Memento(state);
    }

    //将发起人恢复到备忘录对象的状态
    public void restoreMemento(MementoIF memento) {
        Memento m = (Memento) memento;
        this.state = m.getState();
    }

    //状态的获取 和 赋值方法
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    protected class Memento implements MementoIF {
        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }

        private String state;

        private Memento(String state) {
            this.state = state;
        }
    }
}
