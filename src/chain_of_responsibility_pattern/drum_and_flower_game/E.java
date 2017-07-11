package chain_of_responsibility_pattern.drum_and_flower_game;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class E extends Player {

    public E() {
        super();
    }

    public E(Player player) {
        setSuccessor(player);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped) {
            System.out.println("E's turn");
        } else {
            System.out.println("E pass");
            next();
        }
    }
}
