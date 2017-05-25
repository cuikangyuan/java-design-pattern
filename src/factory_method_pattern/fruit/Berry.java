package factory_method_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class Berry implements Fruit {
    @Override
    public void plant() {
        System.out.println("Berry plant");
    }

    @Override
    public void grow() {
        System.out.println("Berry grow");
    }

    @Override
    public void harvest() {
        System.out.println("Berry harvest");
    }
}
