package visitor_pattern.computer_store_example;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/8/30.
 * 复合节点
 */
public class Composite extends Equipment {

    private Vector parts = new Vector();

    public Composite() {

    }

    /**
     * 接受方法
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i< parts.size(); i++) {
            ((Equipment) (parts.get(i))).accept(visitor);
        }
    }

    /**
     * 商业方法
     * @return
     */
    @Override
    public double price() {
        double total = 0;
        for (int i = 0; i< parts.size(); i++) {
            total += ((Equipment) (parts.get(i))).price();
        }
        return total;
    }

    public void add(Equipment equipment) {
        parts.addElement(equipment);
    }
}
