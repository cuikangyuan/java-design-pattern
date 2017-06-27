package flyweight_pattern.coffee_shop_example;

/**
 * Created by cuikangyuan on 2017/6/27.
 */
public class FlavorFactory {

    private Order[] flavors = new Flavor[10];

    private int ordersMade = 0;

    private int totalFlavors = 0;

    public Order getOrder(String flavorToGet) {
        Order order = null;

        if (ordersMade > 0) {
            for (int i = 0; i < ordersMade; i++) {
                if (flavors[i].getFlavor().equals(flavorToGet)) {
                    return flavors[i];
                }
            }
        }

        flavors[ordersMade] = new Flavor(flavorToGet);
        totalFlavors ++;

        return flavors[ordersMade++];
    }

    public int getTotalFlavors() {
        return totalFlavors;
    }

    public void setTotalFlavors(int totalFlavors) {
        this.totalFlavors = totalFlavors;
    }
}
