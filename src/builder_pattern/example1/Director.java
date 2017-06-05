package builder_pattern.example1;

/**
 * Created by cuikangyuan on 2017/6/2.
 */
public class Director {

    private Builder mBuilder;

    public void construct() {

        mBuilder = new ConcreteBuilder();
        mBuilder.buildPart1();
        mBuilder.buildPart2();

        mBuilder.retrieveResult();
    }
}
