package observer_pattern.demo1;

/**
 * Created by cuikangyuan on 2017/7/5.
 * 抽象主题角色
 */
public interface Subject {

    public void attach(Observer observer);

    public void detach(Observer observer);

    void notifyObservers();
}
