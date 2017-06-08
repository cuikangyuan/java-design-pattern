package prototype_pattern.simple_01;

/**
 * Created by cuikangyuan on 2017/6/8.
 */
public class Client {

    private Prototype prototype;

    public void operatiion(Prototype example) {
        Prototype p = (Prototype) example.clone();
    }
}
