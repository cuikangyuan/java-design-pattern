package chain_of_responsibility_pattern.drum_and_flower_game;

import chain_of_responsibility_pattern.drum_and_flower_game.Player;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class A extends Player {

    public A() {
        super();
    }

    public A(Player player) {
        setSuccessor(player);
    }

    @Override
    public void handle() {

        if (DrumBeater.stopped) {
            System.out.println("A's turn");
        } else {
            System.out.println("A pass");
            next();
        }
    }
}
