package strategy_pattern.book_discount_example;

/**
 * Created by cuikangyuan on 2017/7/3.
 */
public class NoDiscountStrategy extends DiscountStrategy {

    public NoDiscountStrategy(int price, int copies) {
        super(price, copies);
    }

    @Override
    public int calculateDiscount() {
        return 0;
    }
}
