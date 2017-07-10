package iterator_pattern.cop_example;

/**
 * Created by cuikangyuan on 2017/7/7.
 */
public interface Iterator {
    void first();
    void next();
    boolean isDone();
    Object currentItem();

}
