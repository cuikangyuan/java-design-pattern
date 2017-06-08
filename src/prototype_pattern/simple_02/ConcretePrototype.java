package prototype_pattern.simple_02;

/**
 * Created by cuikangyuan on 2017/6/8.
 */
public class ConcretePrototype implements Prototype {

    @Override
    public synchronized Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
