package builder_pattern.mail_example;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/6/5.
 */
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String from, String to, Date date) {
        this.builder.buildBody();
        this.builder.buildSubject();
        this.builder.buildFrom(from);
        this.builder.buildTo(to);
        this.builder.buildSendData(date);
        this.builder.sendMessage();

    }
}
