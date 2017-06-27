package flyweight_pattern.coffee_shop_example;

/**
 * Created by cuikangyuan on 2017/6/27.
 * 咖啡摊侍者
 */
public class Client {

    private static Order[] flavors = new Flavor[20];
    private static int ordersMade = 0;
    private static FlavorFactory flavorFactory;


    private static void takeOrder(String flavor) {
        flavors[ordersMade++] = flavorFactory.getOrder(flavor);
    }

    public static void main(String[] args) {
        //创建风味工厂对象
        flavorFactory = new FlavorFactory();

        //创建一个个咖啡对象
        takeOrder("1");
        takeOrder("1");
        takeOrder("1");
        takeOrder("11");
        takeOrder("2");
        takeOrder("2");
        takeOrder("2");
        takeOrder("2");
        takeOrder("2");
        takeOrder("2");

        //将咖啡卖给客人
        for (int i = 0; i < ordersMade; i++) {
            flavors[i].serve();
        }

        System.out.println("卖出去的咖啡种类数 " + flavorFactory.getTotalFlavors());
    }

}

