package default_adapter_pattern;

/**
 * Created by cuikangyuan on 2017/6/14.
 */
public class ServiceAdapter implements AbstractService {

    @Override
    public void serviceOperation1() {

    }

    @Override
    public int serviceOperation2() {
        return 0;
    }

    @Override
    public String serviceOperation3() {
        return null;
    }
}
