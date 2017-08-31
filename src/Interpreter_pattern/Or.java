package Interpreter_pattern;

/**
 * Created by cuikangyuan on 2017/8/31.
 * 逻辑或操作
 */
public class Or extends Expression {

    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) || right.interpret(context);
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Or) {
            return this.left.equals(((Or)o).left)
                    && this.right.equals(((Or)o).right);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}
