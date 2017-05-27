package abstract_factory_pattern.refactor1;

/**
 * Created by cuikangyuan on 2017/5/27.
 */
public interface ComputerProducerInterface {
    Cpu createCpu();
    Ram createRam();
}
