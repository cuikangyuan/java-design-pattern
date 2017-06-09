package adapter_pattern.object_adapter_example;

import adapter_pattern.class_adapter_example.Target;

/**
 * Created by cuikangyuan on 2017/6/9.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }


    //源类有 operation1方法 因此适配器直接委派即可
    @Override
    public void operation1() {
        adaptee.operation1();
    }


    //源类没有 operation2方法 因此适配器需要补充以下方法
    @Override
    public void operation2() {

    }
}
