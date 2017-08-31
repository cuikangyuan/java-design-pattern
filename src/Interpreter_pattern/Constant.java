package Interpreter_pattern;

/**
 * Created by cuikangyuan on 2017/8/31.
 * 代表一个布尔常量
 */
public class Constant extends Expression {

    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Constant) {
            return this.value == ((Constant)o).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }
}
