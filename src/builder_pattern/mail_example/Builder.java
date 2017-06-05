package builder_pattern.mail_example;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/6/5.
 */
public abstract class Builder {

    protected AutoMessage msg;

    public Builder () {

    }

    public abstract void buildSubject();

    public abstract void buildBody();

    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    public void buildTo(String to) {
        msg.setTo(to);
    }

    public void buildSendData(Date date) {
        msg.setSendData(date);
    }

    public void sendMessage() {
        msg.send();
    }

}
