package mediator_pattern;

/**
 * Created by cuikangyuan on 2017/9/1.
 */
public class ConcreteMediator extends Mediator {

    private Colleague1 colleague1;
    private Colleague2 colleague2;

    /**
     * 事件方法的具体实现
     * @param colleague
     */
    @Override
    public void colleagueChanged(Colleague colleague) {
        colleague1.action();
        colleague2.action();
    }

    /**
     * 工厂方法 创建同事对象
     */
    public void createConcreteMediator() {
        colleague1 = new Colleague1(this);
        colleague2 = new Colleague2(this);
    }

    /**
     * 提供同事对象
     * @return
     */
    public Colleague1 getColleague1() {
        return colleague1;
    }

    public Colleague2 getColleague2() {
        return colleague2;
    }
}
