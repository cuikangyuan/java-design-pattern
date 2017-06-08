package prototype_pattern.simple_02;

/**
 * Created by cuikangyuan on 2017/6/8.
 *
 * 为做到深复制  所有需要复制的对象都需要实现
 * java.io.Serializable 接口
 */
public class Client {

    private PrototypeManager manager;
    private Prototype prototype;

    public void registerPrototype() {
        prototype = new ConcretePrototype();
        Prototype copy = (Prototype) prototype.clone();
        manager.add(copy);
    }
}
