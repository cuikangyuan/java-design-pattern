package visitor_pattern.example1;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
abstract public class Node {

    /*
    * 接受操作
    * */

    public abstract void accept(Visitor visitor);
}
