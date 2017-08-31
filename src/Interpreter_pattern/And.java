package Interpreter_pattern;

import chain_of_responsibility_pattern.drum_and_flower_game.A;

/**
 * Created by cuikangyuan on 2017/8/31.
 *
 * 逻辑与操作
 */
public class And extends Expression {

    private Expression left, right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) && right.interpret(context);
    }

    @Override
    public boolean equals(Object o) {

        if (o != null && o instanceof And) {
            return this.left.equals(((And)o).left)
                    && this.right.equals(((And)o).right);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " And " + right.toString() + ")";
    }
}

