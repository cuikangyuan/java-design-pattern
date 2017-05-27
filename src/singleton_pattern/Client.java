package singleton_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by cuikangyuan on 2017/5/27.
 */
public class Client {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type quit to quit");

        do {
            System.out.println("Property to read : ");
            try {

                String line = reader.readLine();
                if (line.equals("quit")) {
                    break;
                }

                System.out.println(ConfigManager.getInstance().getConfigItem(line, "Not found"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);
    }

}
