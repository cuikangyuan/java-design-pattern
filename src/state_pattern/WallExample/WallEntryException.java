package state_pattern.WallExample;

/**
 * Created by cuikangyuan on 2017/8/29.
 */
public class WallEntryException extends Exception {

    public WallEntryException(String message) {
        super(message);
        System.out.println(message);
    }
}
