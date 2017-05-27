package abstract_factory_pattern.pattern_sample;

/**
 * Created by cuikangyuan on 2017/5/26.
 * 抽象工厂
 *
 * 针对生产不同产品族的相同等级的产品 (多个产品)
 *
 * 开闭原则 考虑 增加产品族  增加产品等级结构
 */
public interface Creator {

    ProductA factoryA();

    ProductB factoryB();
}
