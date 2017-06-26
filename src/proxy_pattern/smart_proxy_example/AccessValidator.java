package proxy_pattern.smart_proxy_example;

/**
 * Created by cuikangyuan on 2017/6/26.
 * 检查权限
 */
public class AccessValidator {

    public boolean validateUser(String userId) {
        if (userId.equals("Admin")) {
            return true;
        } else {
            return false;
        }
    }
}
