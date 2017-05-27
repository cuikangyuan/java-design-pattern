package abstract_factory_pattern.refactor1;

import javax.crypto.Mac;

/**
 * Created by cuikangyuan on 2017/5/27.
 */
public class MacProducer extends ComputerProducerAbstractClass{

    private static MacProducer mProducer = new MacProducer();

    private MacProducer() {

    }

    public static MacProducer getInstance() {
        return mProducer;
    }

    @Override
    Cpu createCpu() {
        return null;
    }

    @Override
    Ram createRam() {
        return null;
    }
}
