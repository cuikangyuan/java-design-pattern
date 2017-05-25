package simple_factory;



/**
 * Created by cuikangyuan on 2017/5/24.
 */

public class Apple implements Fruit {

    public int getTreeAge() {
        return mTreeAge;
    }

    public void setTreeAge(int treeAge) {
        mTreeAge = treeAge;
    }

    private int mTreeAge;

    @Override
    public void plant() {
    }

    @Override
    public void grow() {

    }

    @Override
    public void harvest() {
    }
}
