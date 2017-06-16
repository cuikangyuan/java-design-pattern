package decorator_pattern;

/**
 * Created by cuikangyuan on 2017/6/16.
 * 依赖于被装饰对象
 *
 */
public class OrderDecorator extends Order {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
        this.setDate(order.getDate());
        this.setCustomerName(order.getCustomerName());
        this.setItems(order.getItems());
    }

    @Override
    public void print() {
        order.print();
    }
}
