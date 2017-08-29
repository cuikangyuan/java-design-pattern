package visitor_pattern;

/**
 * Created by cuikangyuan on 2017/8/29.
 */
public class SubB extends Super {
    public void operation(SubA a) {
        System.out.print("this is SubB's operation(SubA)");
    }

    public void operation(SubB b) {
        System.out.print("this is SubB's operation(SubB)");
    }

    public void operation(Super s) {
        System.out.print("this is SubB's operation(Super)");
    }
}
