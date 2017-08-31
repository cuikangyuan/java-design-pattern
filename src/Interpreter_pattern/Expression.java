package Interpreter_pattern;

/**
 * Created by cuikangyuan on 2017/8/31.
 *
 * 抽象表达式角色
 */
public abstract class Expression {

    /**
     * 以环境类为准 本方法解释给定的任何一个表达式
     * @param context
     * @return
     */
    public abstract boolean interpret(Context context);

    /**
     * 检验两个表达式在结构上市否相同
     * @param o
     * @return
     */
    public abstract boolean equals(Object o);

    /**
     * 返回表达式的 hash code
     * @return
     */
    public abstract int hashCode();

    /**
     * 将表达式转换为字符串
     * @return
     */
    public abstract String toString();
}
