package iterator_pattern.cop_example;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public class ForwardIterator implements Iterator {

    private Purchase purchase;
    private int state;


    public ForwardIterator(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public void first() {
        state = 0;
    }

    @Override
    public void next() {
        if (!isDone()) {
            state ++;
        }
    }

    @Override
    public boolean isDone() {
        if (state > purchase.count() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return purchase.currentItem(state);
    }
}
