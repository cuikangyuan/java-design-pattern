package flyweight_pattern.simple_flyweight_example;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class ConcreteFlyweight extends Flyweight {

    public Character getInterState() {
        return interState;
    }

    public void setInterState(Character interState) {
        this.interState = interState;
    }

    //内部属性
    private Character interState;

    public ConcreteFlyweight(Character character) {
        this.interState = character;
    }

    @Override
    public void operation(String state) {
    }
}
