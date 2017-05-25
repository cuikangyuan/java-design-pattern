package factory_method_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
