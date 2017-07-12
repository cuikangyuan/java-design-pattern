package command_pattern.simple_example;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class Client {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        Invocker invocker = new Invocker(concreteCommand);

        invocker.action();
    }
}
