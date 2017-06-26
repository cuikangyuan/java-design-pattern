package flyweight_pattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class FlyweightFactory {

    private HashMap files = new HashMap();

    private Flyweight mFlyweight;

    public FlyweightFactory() {

    }

    public Flyweight factory(Character character) {
        Flyweight flyweight = null;

        if (files.containsKey(character)) {
            flyweight  = (Flyweight) files.get(character);
        } else {
            flyweight = new ConcreteFlyweight(character);
            files.put(character, flyweight);
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
