package iterator_pattern.cop_example;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public class PurchaseOfCopB extends Purchase {
    @Override
    public Iterator createIterator() {
        return new BackwardIterator(this);
    }
}
