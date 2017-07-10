package iterator_pattern.black_box;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public class Client {

    private void op() {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.getIterator();

        while (!iterator.isDone()) {
            System.out.println("" + iterator.currentItem());
            iterator.next();
        }
    }

    public static void main(String[] args) {
        new Client().op();
    }
}
