package chain_of_responsibility_pattern;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public abstract class Handler {

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected Handler successor;

    public abstract void handleRequest();
}
