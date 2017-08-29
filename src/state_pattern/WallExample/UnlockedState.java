package state_pattern.WallExample;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/8/29.
 */
public class UnlockedState implements WallStateIF {

    public Date getTimeOfUnlock() {
        return timeOfUnlock;
    }

    public void setTimeOfUnlock(Date timeOfUnlock) {
        this.timeOfUnlock = timeOfUnlock;
    }

    private Date timeOfUnlock;

    @Override
    public void spell(WallEntry wallEntry, String spell) throws WallEntryException {

    }

    @Override
    public void pass(WallEntry wallEntry) throws WallEntryException {
        wallEntry.setState(new LockedState());
    }
}
