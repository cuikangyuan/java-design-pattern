package visitor_pattern;

/**
 * Created by cuikangyuan on 2017/8/29.
 */
public class SubA extends Super {


    public void operation(SubA a) {
        System.out.print("this is SubA's operation(SubA)");
    }

    public void operation(SubB b) {
        System.out.print("this is SubA's operation(SubB)");
    }

    public void operation(Super s) {
        System.out.print("this is SubA's operation(Super)");
    }
}
