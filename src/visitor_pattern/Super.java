package visitor_pattern;

/**
 * Created by cuikangyuan on 2017/8/29.
 *
 * 超类源代码
 */
public class Super {

    public void operation(Super s) {
        System.out.print("this is Super's operation(super)");
        s.operation(this);
    }
}
