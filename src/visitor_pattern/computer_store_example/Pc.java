package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class Pc extends Composite {

    public Pc() {
        super.add(new IntegratedBoard());
        super.add(new HardDisk());
        super.add(new Case());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPc(this);
        System.out.println("Pc has been visited");
        super.accept(visitor);
    }
}
