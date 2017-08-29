package visitor_pattern;

/**
 * Created by cuikangyuan on 2017/8/29.
 *
 * 静态多分派 和 动态单分派 一起存在的例子
 */
public class Client {

    private static Super a;
    private static Super b;

    public static void main(String args[]) {
        a = new SubA();
        b = new SubB();

        a.operation(b);
    }
}
