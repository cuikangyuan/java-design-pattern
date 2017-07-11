package chain_of_responsibility_pattern.drum_and_flower_game;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public abstract class Player {

    public abstract void handle();

    private Player successor;

    public Player getSuccessor() {
        return successor;
    }

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }


    public Player() {
        successor = null;
    }

    public void next() {
        if (successor != null) {
            successor.handle();
        } else {
            System.out.print("结束");
            System.exit(0);
        }
    }

}
