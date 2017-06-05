package builder_pattern.mail_example;

import java.util.Date;

/**
 * Created by cuikangyuan on 2017/6/5.
 */
public abstract class AutoMessage {

    protected String subject = "";
    protected String body = "";
    protected String from = "";
    protected String to = "";
    protected Date sendData = null;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getSendData() {
        return sendData;
    }

    public void setSendData(Date sendData) {
        this.sendData = sendData;
    }

    public AutoMessage() {

    }

    public void send() {

    }
}
