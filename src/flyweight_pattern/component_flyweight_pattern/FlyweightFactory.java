package flyweight_pattern.component_flyweight_pattern;

import flyweight_pattern.simple_flyweight_example.Flyweight;
import flyweight_pattern.simple_flyweight_example.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class FlyweightFactory {

    private HashMap files = new HashMap();

    public FlyweightFactory() {

    }

    /**
     * 复合享元工厂方法
     * @param compositeState
     * @return
     */
    public Flyweight factory(String compositeState) {
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();

        int length = compositeState.length();
        Character state = null;

        for (int i = 0; i < length; i++) {
            state = compositeState.charAt(i);
            concreteCompositeFlyweight.add(state, this.factory(state));
        }
        return concreteCompositeFlyweight;
    }

    /**
     * 单纯享元工厂方法
     * @param character
     * @return
     */
    public Flyweight factory(Character character) {
        Flyweight flyweight = null;

        if (!files.containsKey(character)) {
            flyweight = new ConcreteFlyweight(character);
            files.put(character, flyweight);
        } else {
            flyweight = (Flyweight) files.get(character);
        }

        return flyweight;
    }

    public void checkFlyweight() {
        Flyweight flyweight;
        int i = 0;
        Iterator iterator = files.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry next = (Map.Entry) iterator.next();

            System.out.println("item : " + (++i) + " " + next.getKey());
        }
    }
}
