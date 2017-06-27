package flyweight_pattern.coffee_shop_example;

/**
 * Created by cuikangyuan on 2017/6/27.
 */
public abstract class Order {
    //咖啡出售给客人
    public abstract void serve();
    //返还咖啡的名字
    public abstract String getFlavor();
}
