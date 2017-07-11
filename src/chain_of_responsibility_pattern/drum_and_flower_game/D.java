package chain_of_responsibility_pattern.drum_and_flower_game;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class D extends Player {

    public D() {
        super();
    }

    public D(Player player) {
        setSuccessor(player);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped) {
            System.out.println("D's turn");
        } else {
            System.out.println("D pass");
            next();
        }
    }
}
