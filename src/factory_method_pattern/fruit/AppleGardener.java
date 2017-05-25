package factory_method_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class AppleGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Apple();
    }
}
