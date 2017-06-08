package prototype_pattern.simple_02;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/6/8.
 * 原型管理器
 */
public class PrototypeManager {

    private Vector objects = new Vector();

    /**
     * 聚集管理方法  增加一个新的对象
     * @param prototype
     */
    public void add(Prototype prototype) {
        objects.add(prototype);
    }

    /**
     * 聚集管理方法  取出聚集中一个对象
     *
     */
    public Prototype get(int i) {
        return (Prototype) objects.get(i);
    }

    /**
     * 聚集管理方法  给出聚集的大小
     *
     */
    public int getSize() {
        return objects.size();
    }
}
