package strategy_pattern.book_discount_example;

/**
 * Created by cuikangyuan on 2017/7/3.
 */
public class PercentagesStrategy extends DiscountStrategy {


    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    private int percent;

    public PercentagesStrategy(int price, int copies) {
        super(price, copies);
    }

    @Override
    public int calculateDiscount() {
        return copies * percent * price;
    }
}
