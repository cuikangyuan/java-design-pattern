package visitor_pattern.example1;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class VisitorB implements Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA node) {
        System.out.println("VisitorB.visit(NodeA)");
    }
    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB node) {
        System.out.println("VisitorB.visit(NodeB)");
    }
}
