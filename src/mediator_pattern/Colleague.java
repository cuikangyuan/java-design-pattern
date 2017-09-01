package mediator_pattern;

/**
 * Created by cuikangyuan on 2017/9/1.
 */
public abstract class Colleague {

    private Mediator mediator;

    /**
     * 行动方法 由子类实现
     */
    public abstract void action();

    /**
     * 示意性的商业方法 调用此方法可以改变对象的内部状态
     */
    public void change() {
        mediator.colleagueChanged(this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 构造函数 作为参数接收调停者对象
     * @param mediator
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
