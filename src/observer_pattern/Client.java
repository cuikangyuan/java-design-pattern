package observer_pattern;

import observer_pattern.demo2.ConcreteObserver;
import observer_pattern.demo2.ConcreteSubject;
import observer_pattern.demo2.Observer;
import observer_pattern.demo2.Subject;

/**
 * Created by cuikangyuan on 2017/7/5.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver();

        subject.attach(observer);

        subject.changeState("new State");
    }
}
