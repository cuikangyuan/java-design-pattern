package iterator_pattern.white_box;

/**
 * Created by cuikangyuan on 2017/7/7.
 */
public class ConcreteAggregate extends Aggregate {

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }


    private Object[] objects = {"a", "b", "c", "d"};


    /**
     * 取值方法 向外界提供聚集中的元素
     * @param inex
     * @return
     */
    public Object getElement(int inex) {
        if (inex < objects.length) {
            return objects[inex];
        } else {
            return null;
        }
    }

    public int size() {
        if (objects == null) {
            return 0;
        } else {
            return objects.length;
        }
    }
}
