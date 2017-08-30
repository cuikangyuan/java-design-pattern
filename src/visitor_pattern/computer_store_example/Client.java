package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class Client {

    private static PriceVisitor priceVisitor;
    private static InventoryVisitor inventoryVisitor;
    private static Equipment equipment;

    public static void main(String[] args) {
        equipment = new Pc();

        priceVisitor = new PriceVisitor();

        equipment.accept(priceVisitor);

        System.out.println("Price: " + priceVisitor.value());

        inventoryVisitor = new InventoryVisitor();

        equipment.accept(inventoryVisitor);

        System.out.println("Number of parts: " + inventoryVisitor.size());

    }
}
