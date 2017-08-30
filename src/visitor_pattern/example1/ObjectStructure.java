package visitor_pattern.example1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class ObjectStructure {

    private Vector nodes;
    private Node node;

    /**
     * 构造函数
     */

    public ObjectStructure() {
        nodes = new Vector();
    }

    /**
     * 执行访问操作
     */

    public void action(Visitor visitor) {
        for (Enumeration enumeration = nodes.elements();
                enumeration.hasMoreElements();) {

            node = (Node) enumeration.nextElement();
            node.accept(visitor);
        }
    }

    /**
     * 增加一个新的元素
     * @param node
     */
    public void add(Node node) {
        nodes.addElement(node);
    }
}
