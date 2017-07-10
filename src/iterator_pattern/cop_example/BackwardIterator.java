package iterator_pattern.cop_example;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public class BackwardIterator implements Iterator {

    private Purchase purchase;
    private int state;


    public BackwardIterator(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public void first() {
        state = purchase.count() - 1;
    }

    @Override
    public void next() {
        if (!isDone()) {
            state --;
        }
    }

    @Override
    public boolean isDone() {
        if (state < 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object currentItem() {
        return purchase.currentItem(state);
    }
}
