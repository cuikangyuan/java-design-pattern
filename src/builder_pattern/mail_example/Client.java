package builder_pattern.mail_example;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/6/5.
 */
public class Client {

    private static Builder builder;

    private static Director director;

    public static void main(String[] argsss) {

        builder = new WelcomeBuilder();

        director = new Director(builder);

        director.construct("", "", new Date());
    }
}
