package visitor_pattern.example1;

/**
 * Created by cuikangyuan on 2017/8/30.
 * 抽象访问者角色
 */
public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    void visit(NodeA node);

    /**
     * 对应于NodeB的访问操作
     */
    void visit(NodeB node);
}
