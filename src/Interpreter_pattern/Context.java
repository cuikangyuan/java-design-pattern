package Interpreter_pattern;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

/**
 * Created by cuikangyuan on 2017/8/31.
 */
public class Context {

    private HashMap map = new HashMap();

    public void assign(Variable variable, boolean value) {
        map.put(variable, new Boolean(value));
    }

    public boolean lookup(Variable variable)
        throws IllegalArgumentException
    {
        Boolean value = (Boolean) map.get(variable);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
