package flyweight_pattern;

/**
 * Created by cuikangyuan on 2017/6/26.
 * 抽象享元角色
 */
public abstract class Flyweight {

    //参数为 外部状态
    abstract public void operation(String state);
}
