package flyweight_pattern.big_coffee_shop_example;

/**
 * Created by cuikangyuan on 2017/6/27.
 */
public class Table {

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;


    public Table(int number) {
        this.number = number;
    }

}
