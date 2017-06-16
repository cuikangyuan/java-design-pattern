package decorator_pattern;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/6/16.
 */
public abstract class Order {

    private OrderLine orderLine;
    protected String customerName;
    protected Date date;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    protected List items = new ArrayList();

    public void print() {
        for (int i = 0; i < items.size(); i++) {
            OrderLine orderLine = (OrderLine) items.get(i);
            orderLine.printLine();
        }
    }

    public void addItem(OrderLine item) {
        items.add(item);
    }

    public void removeItem(OrderLine item) {
        items.remove(item);
    }

    public double getGrandTotal() {
        double amount = 0.0D;
        for (int i = 0; i < items.size(); i++) {
            OrderLine orderLine = (OrderLine) items.get(i);
            //TODO
        }

        return amount;
    }

    protected String formatCurrency(double amount) {
        return NumberFormat.getCurrencyInstance().format(amount);
    }
}
