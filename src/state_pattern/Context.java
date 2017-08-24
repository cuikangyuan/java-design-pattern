package state_pattern;

/**
 * Created by cuikangyuan on 2017/8/24.
 * 环境类
 *
 * 具体行为委派给 具体状态类
 */
public class Context {

    private State state;

    public void sampleOperation() {
        state.sampleOperation();
    }

    public void setState(State state) {
        this.state = state;
    }
}
