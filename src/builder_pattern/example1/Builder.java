package builder_pattern.example1;

/**
 * Created by cuikangyuan on 2017/6/2.
 * 抽象建造者
 */
public abstract class Builder {

    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract Product retrieveResult();
}
