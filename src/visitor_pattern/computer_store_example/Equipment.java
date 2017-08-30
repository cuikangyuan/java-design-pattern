package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 *
 * 抽象节点s
 */
abstract public class Equipment {

    /**
     * 接受方法
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    /**
     *商业方法
     */
    public abstract double price();

}
