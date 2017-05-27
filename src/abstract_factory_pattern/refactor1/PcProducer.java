package abstract_factory_pattern.refactor1;

/**
 * Created by cuikangyuan on 2017/5/27.
 */
public class PcProducer extends ComputerProducerAbstractClass{

    private static PcProducer mProducer = new PcProducer();

    private PcProducer() {

    }

    public static PcProducer getInstance() {
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
