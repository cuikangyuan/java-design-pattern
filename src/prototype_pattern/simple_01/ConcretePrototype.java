package prototype_pattern.simple_01;

/**
 * Created by cuikangyuan on 2017/6/8.
 */
public class ConcretePrototype implements Prototype {

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
