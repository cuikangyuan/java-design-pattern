package facade_pattern.with_facade;

/**
 * Created by cuikangyuan on 2017/6/28.
 */
public class Client {

    static private SecurityFacade securityFacade;

    public static void main(String[] args) {
        securityFacade.activate();
    }
}
