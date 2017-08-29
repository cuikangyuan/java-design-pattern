package state_pattern.WallExample;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/8/29.
 */
public class LockedState implements WallStateIF{

    private Date timeOfLock;
    protected static String rightSpell = "猴精猴精抗毒素";

    public LockedState() {
        this.setTimeOfLock(new Date());
    }

    public Date getTimeOfLock() {
        return timeOfLock;
    }

    public void setTimeOfLock(Date timeOfLock) {
        this.timeOfLock = timeOfLock;
    }

    public static String getRightSpell() {
        return rightSpell;
    }

    public static void setRightSpell(String rightSpell) {
        LockedState.rightSpell = rightSpell;
    }

    @Override
    public void spell(WallEntry wallEntry, String spell) throws WallEntryException {
        if (spell.equals(this.rightSpell)) {
            wallEntry.setState(new UnlockedState());
        } else {
            throw new WallEntryException("Wrong Spell...");
        }
    }

    @Override
    public void pass(WallEntry wallEntry) throws WallEntryException {
        throw new WallEntryException("passed...");
    }
}
