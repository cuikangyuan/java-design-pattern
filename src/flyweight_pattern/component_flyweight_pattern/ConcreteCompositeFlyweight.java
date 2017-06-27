package flyweight_pattern.component_flyweight_pattern;

import flyweight_pattern.simple_flyweight_example.Flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by cuikangyuan on 2017/6/27.
 */
public class ConcreteCompositeFlyweight extends Flyweight {

    private HashMap files = new HashMap(10);
    private Flyweight flyweight;

    /**
     * 传入外部状态
     * @param state
     */
    @Override
    public void operation(String state) {
        Flyweight fly = null;

        Iterator iterator = files.keySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            fly = (Flyweight) mapEntry.getValue();
            fly.operation(state);
        }
    }

    public ConcreteCompositeFlyweight() {

    }

    /**
     * 添加单纯享元对象
     * @param key
     * @param flyweight
     */
    public void add(Character key, Flyweight flyweight) {
        if (!files.containsKey(key)) {
            files.put(key, flyweight);
        }
    }
}
