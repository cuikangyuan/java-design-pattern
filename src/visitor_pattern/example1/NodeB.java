package visitor_pattern.example1;

/**
 * Created by cuikangyuan on 2017/8/30.
 *
 * 具体节点声明接受方法，也可以有若干个商业方法
 */
public class NodeB extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeB 特有的商业方法
     */
    public String operationB() {
        return "NodeB is visited";
    }
}
