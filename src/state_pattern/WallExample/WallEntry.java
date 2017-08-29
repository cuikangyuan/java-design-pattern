package state_pattern.WallExample;

/**
 * Created by cuikangyuan on 2017/8/29.
 *
 * 环境类
 */
public class WallEntry {

    public WallStateIF state;

    public void setState(WallStateIF state) {
        this.state = state;
    }

    public void pass() throws WallEntryException {
        state.pass(this);
    }

    public void spell(String string) throws WallEntryException {
        state.spell(this, string);
    }
}
