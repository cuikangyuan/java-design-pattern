package Interpreter_pattern;

/**
 * Created by cuikangyuan on 2017/8/31.
 * 有名变量
 */
public class Variable extends Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(this);
    }

    @Override
    public boolean equals(Object o) {

        if (o != null && o instanceof Variable) {
            return this.name.equals(((Variable)o).name);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
