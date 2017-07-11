package factory_method_pattern;

import factory_method_pattern.fruit.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class Client {

    public static void main(String[] args) {

        //FruitGardener gardener = new AppleGardener();
        /*
        FruitGardener gardener = new GrapeGardener();
        Fruit fruit = gardener.factory();

        fruit.plant();
        fruit.grow();
        fruit.harvest();
        */

        /*
        try {
            URL url = new URL("http://www.baidu.com");
            URLConnection urlConnection = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String lineStr;
            while ((lineStr = bufferedReader.readLine()) != null) {
                System.out.println(lineStr);
            }

            bufferedReader.close();

        } catch (MalformedURLException E) {
            E.printStackTrace();
        } catch (IOException E) {
            E.printStackTrace();
        }
        */
    }
}
