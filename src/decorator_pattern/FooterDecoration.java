package decorator_pattern;

/**
 * Created by cuikangyuan on 2017/6/16.
 */
public class FooterDecoration extends OrderDecorator {

    public FooterDecoration(Order order) {
        super(order);
    }

    @Override
    public void print() {

        super.print();
        this.printFooter();
    }

    private void printFooter() {
        System.out.println("-------Footer-------");
    }
}
