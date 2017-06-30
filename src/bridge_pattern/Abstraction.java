package bridge_pattern;

/**
 * Created by cuikangyuan on 2017/6/28.
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void operation() {
        implementor.operationImpl();
    }
}
