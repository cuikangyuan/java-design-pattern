package simple_factory_pattern.fruit;



/**
 * Created by cuikangyuan on 2017/5/24.
 */

public class Grape implements Fruit {

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    private boolean seedless;

    @Override
    public void plant() {

    }

    @Override
    public void grow() {

    }

    @Override
    public void harvest() {

    }
}
