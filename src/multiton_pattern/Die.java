package multiton_pattern;

import java.util.Date;
import java.util.Random;

/**
 * Created by cuikangyuan on 2017/6/2.
 * 骰子类
 */
public class Die {

    //有上限的多例类
    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private Die() {

    }

    public static Die getInstance(int whichOne) {
        if (whichOne == 1) {
            return die1;
        } else {
            return die2;
        }
    }

    public synchronized int dice() {
        Date date = new Date();

        Random random = new Random(date.getTime());

        int value = random.nextInt();
        value = Math.abs(value);
        value = value % 6;
        value += 1;

        return value;
    }
}
