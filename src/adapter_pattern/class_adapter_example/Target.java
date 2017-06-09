package adapter_pattern.class_adapter_example;

/**
 * Created by cuikangyuan on 2017/6/9.
 */
public interface Target {

    //源类 也有的方法
    void operation1();

    //源类 没有的方法
    void operation2();
}
