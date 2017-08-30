package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class PriceVisitor extends Visitor {

    private float total;

    /**
     * 构造方法
     */
    public PriceVisitor() {
        total = 0;
    }

    /**
     * 商业方法
     * @return
     */
    public float value() {
        return total;
    }

    /**
     * 访问方法
     * @param e
     */
    @Override
    public void visitHardDisk(HardDisk e) {
        total += e.price();
    }

    @Override
    public void visitMainBoard(MainBoard e) {
        total += e.price();
    }

    @Override
    public void visitCpu(Cpu e) {
        total += e.price();
    }

    @Override
    public void visitPc(Pc e) {
        total += e.price();
    }

    @Override
    public void visitCase(Case e) {
        total += e.price();
    }

    @Override
    public void visitIntegratedBoard(IntegratedBoard e) {
        total += e.price();
    }
}
