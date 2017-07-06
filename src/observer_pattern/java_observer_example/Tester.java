package observer_pattern.java_observer_example;

/**
 * Created by cuikangyuan on 2017/7/6.
 */
public class Tester {
    public static void main(String[] args) {
        Watched watched = new Watched();
        Watcher watcher = new Watcher(watched);


        watched.changeData("a");
        watched.changeData("a");
        watched.changeData("c");
        watched.changeData("b");

    }
}
