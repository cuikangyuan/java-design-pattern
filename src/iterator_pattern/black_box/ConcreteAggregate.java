package iterator_pattern.black_box;


/**
 * Created by cuikangyuan on 2017/7/7.
 */
public class ConcreteAggregate extends Aggregate {

    @Override
    public Iterator getIterator() {
        return new innerConcreteIterator();
    }


    private Object[] objects = {"A", "B", "C", "D"};


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

    private class innerConcreteIterator implements iterator_pattern.black_box.Iterator{

        private int index = 0;

        public innerConcreteIterator() {

        }

        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            if (index < objects.length) {
                index++;
            }
        }

        @Override
        public boolean isDone() {
            if (index >= objects.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object currentItem() {
            return objects[index];
        }
    }
}
