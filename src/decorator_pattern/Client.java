package decorator_pattern;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/6/16.
 */
public class Client {
    public static void main(String[] args) {

        Order order = new SalesOrder();
        order.setCustomerName("122");
        order.setDate(new Date());

        OrderLine orderLine1 = new OrderLine();
        orderLine1.setItenName("1");
        orderLine1.setUnitPrice(11d);
        orderLine1.setUnits(123);

        order.addItem(orderLine1);

        OrderLine orderLine2 = new OrderLine();
        orderLine2.setItenName("2");
        orderLine2.setUnitPrice(13d);
        orderLine2.setUnits(124);

        order.addItem(orderLine2);

        Order orderPlus = new HeaderDecoration(new FooterDecoration(order));

        orderPlus.print();
    }
}
