package state_pattern.WallExample;

/**
 * Created by cuikangyuan on 2017/8/29.
 */
public interface WallStateIF {
    void spell(WallEntry wallEntry, String spell) throws WallEntryException;
    void pass(WallEntry wallEntry) throws WallEntryException;
}
