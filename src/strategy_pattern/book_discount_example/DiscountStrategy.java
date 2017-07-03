package strategy_pattern.book_discount_example;

/**
 * Created by cuikangyuan on 2017/7/3.
 */
public abstract class DiscountStrategy {

    protected int price = 0;

    protected int copies = 0;

    public DiscountStrategy(int price, int copies) {
        this.price = price;
        this.copies = copies;
    }

    //策略方法
    public abstract int calculateDiscount();
}
