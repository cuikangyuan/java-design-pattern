package visitor_pattern.computer_store_example;

/**
 * Created by cuikangyuan on 2017/8/30.
 */
public class IntegratedBoard extends Composite{

    public IntegratedBoard() {
        super.add(new MainBoard());
        super.add(new Cpu());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitIntegratedBoard(this);
        System.out.println("IntegratedBoard has been visited");
        super.accept(visitor);
    }
}
