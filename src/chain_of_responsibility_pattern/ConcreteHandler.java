package chain_of_responsibility_pattern;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public class ConcreteHandler extends Handler {

    public ConcreteHandler() {

    }

    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            getSuccessor().handleRequest();
        } else {
            //自己处理
        }
    }
}
