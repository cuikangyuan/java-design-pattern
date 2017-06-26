package proxy_pattern.smart_proxy_example;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class Proxy implements Searcher {

    private RealSearcher realSearcher;
    private UsageLogger usageLogger;
    private AccessValidator accessValidator;

    public Proxy() {

        realSearcher = new RealSearcher();
    }

    @Override
    public String doSearch(String userId, String searchType) {

        if (checkAccess(userId)) {
            String result = realSearcher.doSearch(userId, searchType);
            logUsage(userId);
            return result;
        } else {
            return null;
        }
    }

    private boolean checkAccess(String userId) {
        accessValidator = new AccessValidator();
        return accessValidator.validateUser(userId);
    }

    private void logUsage(String userId) {
        usageLogger = new UsageLogger();
        usageLogger.setUserId(userId);
        usageLogger.save();
    }
}
