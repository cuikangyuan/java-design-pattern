package factory_method_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class BerryGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Berry();
    }
}
