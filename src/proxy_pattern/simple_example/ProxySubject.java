package proxy_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/6/23.
 * 代理主题
 *
 * 起到传递请求的作用，并在传递前 和传递后 做出相应的处理
 */
public class ProxySubject extends Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        preRequest();

        if (realSubject != null) {
            realSubject = new RealSubject();
        }

        realSubject.request();

        afterRequest();
    }

    private void preRequest() {
        System.out.println("proxy subject pre request");
    }

    private void afterRequest() {
        System.out.println("proxy subject after request");
    }
}
