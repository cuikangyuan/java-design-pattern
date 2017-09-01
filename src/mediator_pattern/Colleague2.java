package mediator_pattern;

/**
 * Created by cuikangyuan on 2017/9/1.
 */
public class Colleague2 extends Colleague {
    /**
     * 构造函数 作为参数接收调停者对象
     *
     * @param mediator
     */
    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("this is action from Colleague 2");
    }
}
