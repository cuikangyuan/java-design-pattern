package visitor_pattern.example1;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class Client {

    private static ObjectStructure objectStructure;
    private static Visitor visitor;

    public static void main(String[] args) {
        //创建结构对象
        objectStructure = new ObjectStructure();
        //增加一个节点
        objectStructure.add(new NodeA());
        //增加一个节点
        objectStructure.add(new NodeB());
        //增加一个访问者
        visitor = new VisitorA();
        //访问者访问结构
        objectStructure.action(visitor);

    }

}
