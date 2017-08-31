package Interpreter_pattern;

/**
 * Created by cuikangyuan on 2017/8/31.
 */
public class Client {

    private static Context context;
    private static Expression expression;

    public static void main(String[] args) {
        context = new Context();

        Variable x = new Variable("x");

        Variable y = new Variable("y");

        Constant constant = new Constant(true);

        context.assign(x, false);

        context.assign(y, true);

        expression = new Or(new And(constant, x), new And(y, new Not(x)) );


        System.out.println("x = " + x.interpret(context));
        System.out.println("y = " + y.interpret(context));
        System.out.println(expression.toString() + " = " + expression.interpret(context));

    }
}
