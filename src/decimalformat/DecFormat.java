package decimalformat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecFormat {
    public static void main(String[] args) {

        double num1 = 1231231.32534535;
        DecimalFormat df = new DecimalFormat("#,###.####");
        DecimalFormat dfGermany = new DecimalFormat("#,###.##", new DecimalFormatSymbols(Locale.GERMAN));
        System.out.println(df.format(num1));
        System.out.println(dfGermany.format(num1));
    }
}
