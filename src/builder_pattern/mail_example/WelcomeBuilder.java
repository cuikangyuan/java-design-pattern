package builder_pattern.mail_example;

/**
 * Created by cuikangyuan on 2017/6/5.
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("");
    }

    @Override
    public void buildBody() {
        msg.setBody("");
    }
}
