package flyweight_pattern.big_coffee_shop_example;

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
    public void serve(Table table) {
        System.out.println("table : " +  table.getNumber() + " flavor :" + flavor);
    }

    @Override
    public String getFlavor() {
        return flavor;
    }
}
