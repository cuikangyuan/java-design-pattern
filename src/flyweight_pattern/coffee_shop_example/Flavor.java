package flyweight_pattern.coffee_shop_example;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by cuikangyuan on 2017/6/27.
 */
public class Flavor extends Order {

    private String flavor;

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serve() {
        System.out.println("flavor :" + flavor);
    }

    @Override
    public String getFlavor() {
        return flavor;
    }
}
