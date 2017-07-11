package chain_of_responsibility_pattern.drum_and_flower_game;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class B extends Player {

    public B() {
        super();
    }

    public B(Player player) {
        setSuccessor(player);
    }

    @Override
    public void handle() {
        if (DrumBeater.stopped) {
            System.out.println("B's turn");
        } else {
            System.out.println("B pass");
            next();
        }
    }
}
