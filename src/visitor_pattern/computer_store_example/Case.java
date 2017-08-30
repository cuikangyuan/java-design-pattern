package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class Case extends Equipment {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Case has been visited");
        visitor.visitCase(this);
    }

    @Override
    public double price() {
        return 30.00;
    }
}
