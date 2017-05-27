package singleton_pattern;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by cuikangyuan on 2017/5/27.
 */
public class ConfigManager {

    private static final String FILE_NAME = System.getProperty("user.dir") +
            File.separator + "Singleton.properties";

    private File mFile = null;

    private long mLastModifiedTime = 0;

    private Properties mProperties = null;

    private static ConfigManager mInstance = new ConfigManager();

    private ConfigManager() {

        mFile = new File(FILE_NAME);

        System.out.println(FILE_NAME);

        mLastModifiedTime = mFile.lastModified();

        if (mLastModifiedTime == 0) {
            System.out.println(FILE_NAME + "file does not exist");
        }

        mProperties = new Properties();
        try {
            mProperties.load(new FileInputStream(FILE_NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public static ConfigManager getInstance() {
        return mInstance;
    }

    final public Object getConfigItem(String name, Object defaultValue){

        long lastModified = mFile.lastModified();

        if (lastModified == 0) {
            if (mLastModifiedTime == 0) {
                System.out.println(FILE_NAME + "file does not exist");
            } else {
                System.out.println(FILE_NAME + "file deleted");
            }

            return defaultValue;

        } else if (lastModified > mLastModifiedTime) {
            mProperties.clear();

            try {
                mProperties.load(new FileInputStream(FILE_NAME));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        mLastModifiedTime = lastModified;
        Object val = mProperties.getProperty(name);

        if (val == null) {
            return defaultValue;
        } else {
            return val;
        }
    }
}
