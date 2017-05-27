package abstract_factory_pattern.refactor1;

/**
 * Created by cuikangyuan on 2017/5/27.
 *
 */
public abstract class ComputerProducerAbstractClass {

    abstract Cpu createCpu();
    abstract Ram createRam();

    //抽象工厂类 配备静态方法 根据参数返回具体工厂
    /*
    public static ComputerProducerAbstractClass getProducer(String which) {
        if (which.equalsIgnoreCase("pc")) {
            return new PcProducer();
        } else if (which.equalsIgnoreCase("mac")) {
            return new MacProducer();
        } else {
            return null;
        }
    }
    */

    //抽象工厂类 配备静态方法 根据参数返回具体工厂(单例)
    public static ComputerProducerAbstractClass getProducer(String which) {
        if (which.equalsIgnoreCase("pc")) {
            return PcProducer.getInstance();
        } else if (which.equalsIgnoreCase("mac")) {
            return MacProducer.getInstance();
        } else {
            return null;
        }
    }
}
