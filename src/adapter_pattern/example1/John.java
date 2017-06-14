package adapter_pattern.example1;

/**
 * Created by cuikangyuan on 2017/6/14.
 * 类的适配器模式
 * 适配器角色
 */
public class John extends Kittie implements Puppie {

    @Override
    public void wao() {
        this.miao();
    }

    @Override
    public void fetchBall() {
        this.catchRat();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
