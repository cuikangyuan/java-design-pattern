package builder_pattern.example1;

/**
 * Created by cuikangyuan on 2017/6/2.
 */
public class ConcreteBuilder extends Builder{

    private Product product = new Product1();

    @Override
    public void buildPart1() {

    }

    @Override
    public void buildPart2() {

    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
