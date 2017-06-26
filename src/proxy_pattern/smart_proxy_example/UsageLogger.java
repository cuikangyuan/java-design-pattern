package proxy_pattern.smart_proxy_example;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class UsageLogger {

    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void save() {
        //保存log
    }

    public void save(String userId) {
        this.userId = userId;
        save();
    }
}
