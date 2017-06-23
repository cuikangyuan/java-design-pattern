package proxy_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/6/23.
 */
public class Client {

    public static void main(String args[]) {

        Subject subject = new ProxySubject();
        subject.request();
    }

}
