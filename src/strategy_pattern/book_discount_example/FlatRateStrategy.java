package strategy_pattern.book_discount_example;

/**
 * Created by cuikangyuan on 2017/7/3.
 */
public class FlatRateStrategy extends DiscountStrategy {

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;



    public FlatRateStrategy(int price, int copies) {
        super(price, copies);
    }

    @Override
    public int calculateDiscount() {
        return amount * copies;
    }
}
