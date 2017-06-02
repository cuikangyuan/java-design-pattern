package multiton_pattern;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by cuikangyuan on 2017/6/2.
 */
public class NumberFormatTester {

    static public  void displayNumber(Double amount, Locale locale) {
        NumberFormat format;
        String str;

        format = NumberFormat.getNumberInstance(locale);

        str = format.format(amount);

        System.out.println(str + "   " + locale.toString());
    }

    static public  void displayCurrency(Double amount, Locale locale) {
        NumberFormat format;
        String str;

        format = NumberFormat.getCurrencyInstance(locale);

        str = format.format(amount);

        System.out.println(str + "   " + locale.toString());
    }

    static public  void displayPercent(Double amount, Locale locale) {
        NumberFormat format;
        String str;

        format = NumberFormat.getPercentInstance(locale);

        str = format.format(amount);

        System.out.println(str + "   " + locale.toString());
    }


    static public void main(String[] args) {
        displayNumber(new Double(1234567.89), new Locale("en", "US"));

        displayNumber(new Double(1234567.89), new Locale("de", "DE"));

        displayNumber(new Double(1234567.89), new Locale("fr", "FR"));


        displayCurrency(new Double(1234567.89), new Locale("en", "US"));

        displayCurrency(new Double(1234567.89), new Locale("de", "DE"));

        displayCurrency(new Double(1234567.89), new Locale("fr", "FR"));

        displayPercent(new Double(1234567.89), new Locale("en", "US"));

        displayPercent(new Double(1234567.89), new Locale("de", "DE"));

        displayPercent(new Double(1234567.89), new Locale("fr", "FR"));
    }
}
