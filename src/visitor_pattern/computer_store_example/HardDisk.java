package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class HardDisk extends Equipment{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("HardDisk has been visited");
        visitor.visitHardDisk(this);
    }

    @Override
    public double price() {
        return 200.00;
    }
}
