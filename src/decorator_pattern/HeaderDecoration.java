package decorator_pattern;

/**
 * Created by cuikangyuan on 2017/6/16.
 */
public class HeaderDecoration extends OrderDecorator {

    public HeaderDecoration(Order order) {
        super(order);
    }

    @Override
    public void print() {
        this.printHeader();
        super.print();
    }

    private void printHeader() {
        System.out.println("-------Header-------");
    }
}
