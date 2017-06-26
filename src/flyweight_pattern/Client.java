package flyweight_pattern;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight a = flyweightFactory.factory(new Character('a'));

        a.operation("first call");

        a = flyweightFactory.factory(new Character('b'));

        a.operation("second call");

        a = flyweightFactory.factory(new Character('a'));

        a.operation("third call");


        flyweightFactory.checkFlyweight();


    }
}
