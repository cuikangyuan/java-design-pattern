package factory_method_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class Grape implements Fruit {
    @Override
    public void plant() {
        System.out.println("Grape plant");
    }

    @Override
    public void grow() {
        System.out.println("Grape grow");
    }

    @Override
    public void harvest() {
        System.out.println("Grape harvest");
    }
}
