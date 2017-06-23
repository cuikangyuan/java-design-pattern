package proxy_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/6/23.
 * 被代理的主题
 */
public class RealSubject extends Subject {

    public RealSubject() {

    }

    @Override
    public void request() {
        System.out.println("from real subject");
    }
}
