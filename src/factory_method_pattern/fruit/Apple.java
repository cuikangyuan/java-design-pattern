package factory_method_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class Apple implements Fruit {
    @Override
    public void plant() {
        System.out.println("Apple plant");
    }

    @Override
    public void grow() {
        System.out.println("Apple grow");
    }

    @Override
    public void harvest() {
        System.out.println("Apple harvest");
    }
}
