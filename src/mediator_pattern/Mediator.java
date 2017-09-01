package mediator_pattern;

/**
 * Created by cuikangyuan on 2017/9/1.
 */
public abstract class Mediator {

    public abstract void colleagueChanged(Colleague colleague);

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.createConcreteMediator();
        Colleague1 colleague1 = concreteMediator.getColleague1();
        Colleague2 colleague2 = concreteMediator.getColleague2();

        concreteMediator.colleagueChanged(colleague1);
    }
}
