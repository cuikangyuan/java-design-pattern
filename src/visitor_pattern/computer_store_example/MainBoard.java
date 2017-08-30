package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 * 具体节点类
 */
public class MainBoard extends Equipment{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("MainBoard has been visited");
        visitor.visitMainBoard(this);
    }

    @Override
    public double price() {
        return 100.00;
    }
}
