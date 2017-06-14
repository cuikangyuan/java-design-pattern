package adapter_pattern.example1;

/**
 * Created by cuikangyuan on 2017/6/14.
 *
 * 适配的 目标角色
 */
public interface Puppie {
    void wao();
    void fetchBall();
    void run();
    void sleep();
    void setName(String name);
    String getName();
}
