package visitor_pattern.computer_store_example;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class InventoryVisitor extends Visitor {

    private Vector inv;

    /**
     *构造方法
     */
    public InventoryVisitor() {
        inv = new Vector(10, 5);
    }

    /**
     * 商业方法
     * @return
     */
    public int size() {
        return inv.size();
    }

    /**
     * 访问方法
     * @param e
     */
    @Override
    public void visitHardDisk(HardDisk e) {
        inv.addElement(e);
    }

    @Override
    public void visitMainBoard(MainBoard e) {
        inv.addElement(e);
    }

    @Override
    public void visitCpu(Cpu e) {
        inv.addElement(e);
    }

    @Override
    public void visitPc(Pc e) {
        inv.addElement(e);
    }

    @Override
    public void visitCase(Case e) {
        inv.addElement(e);
    }

    @Override
    public void visitIntegratedBoard(IntegratedBoard e) {
        inv.addElement(e);
    }
}
