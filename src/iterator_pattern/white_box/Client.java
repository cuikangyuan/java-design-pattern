package iterator_pattern.white_box;

/**
 * Created by cuikangyuan on 2017/7/7.
 */
public class Client {



    public void op() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.getIterator();

        while (!iterator.isDone()) {
            System.out.println("" + iterator.currentItem());

            iterator.next();
        }

    }

    public static void main(String[] args) {

        new Client().op();

    }
}
