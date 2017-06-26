package proxy_pattern.smart_proxy_example;

/**
 * Created by cuikangyuan on 2017/6/26.
 */
public class Client {

    private static Searcher searcher;

    public static void main(String[] args) {

        searcher = new Proxy();
        String userId = "Admin";
        String searchType = "";

        String result = searcher.doSearch(userId, searchType);
    }
}
