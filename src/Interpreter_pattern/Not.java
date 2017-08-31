package Interpreter_pattern;

import visitor_pattern.example1.Node;

/**
 * Created by cuikangyuan on 2017/8/31.
 */
public class Not extends Expression {

    private Expression expression;

    public Not(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Context context) {
        return !expression.interpret(context);
    }

    @Override
    public boolean equals(Object o) {

        if (o != null && o instanceof Not) {
            return this.expression.toString().equals(((Not)o).expression.toString());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (this.expression.toString()).hashCode();
    }

    @Override
    public String toString() {
        return "(Not " + this.expression.toString() + ")";
    }
}
