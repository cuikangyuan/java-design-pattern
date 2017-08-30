package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 *
 * 访问者角色
 */
public abstract class Visitor {
    public abstract void visitHardDisk(HardDisk e);
    public abstract void visitMainBoard(MainBoard e);
    public abstract void visitCpu(Cpu e);
    public abstract void visitPc(Pc e);
    public abstract void visitCase(Case e);
    public abstract void visitIntegratedBoard(IntegratedBoard e);
}
