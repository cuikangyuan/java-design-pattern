package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class Cpu extends Equipment {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Cpu has been visited");
        visitor.visitCpu(this);
    }

    @Override
    public double price() {
        return 800.00;
    }
}
