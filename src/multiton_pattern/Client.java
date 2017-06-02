package multiton_pattern;

/**
 * Created by cuikangyuan on 2017/6/2.
 */
public class Client {

    private static Die die1, die2;

    public static void main(String[] args) {
        die1 = Die.getInstance(1);
        die2 = Die.getInstance(2);

        die1.dice();
        die2.dice();
    }
}
