package adapter_pattern.class_adapter_example;

import adapter_pattern.object_adapter_example.Adaptee;

/**
 * Created by cuikangyuan on 2017/6/9.
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 源类 没有 以下方法 因此适配器类补充上这个方法
     */
    @Override
    public void operation2() {

    }
}
