package simple_factory_pattern.fruit;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class Client {

    public static void main(String[] args) {
        try {
            Fruit fruit1 = FruitGardener.factory("apple");
            fruit1.grow();
            Fruit fruit2 = FruitGardener.factory("grape");
            fruit2.grow();
            Fruit fruit3 = FruitGardener.factory("strawberry");
            fruit3.grow();
            Fruit fruit4 = FruitGardener.factory("pineapple");
            fruit4.grow();
        } catch (BadFruitException e) {
            e.printStackTrace();
        }
    }
}
