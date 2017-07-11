package chain_of_responsibility_pattern.drum_and_flower_game;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class C extends Player {

    public C() {
        super();
    }

    public C(Player player) {
        setSuccessor(player);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped) {
            System.out.println("C's turn");
        } else {
            System.out.println("C pass");
            next();
        }
    }
}
