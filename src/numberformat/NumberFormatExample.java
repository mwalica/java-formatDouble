package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
       percentFormatGermany(0.76);
       numberFormatGetInstance(0.76);
       currencyFormat(300.21);


    }

    //metoda do ogólnego zapisu liczby
    public static void numberFormatGetInstance(double a) {
        NumberFormat nf = NumberFormat.getInstance();//lokalne formatowanie
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.format(a));
        System.out.println(nfUs.format(a));
    }

    //metoda do procentowego zapisu liczby
    public static void percentFormatGermany(double a) {
        NumberFormat nfPercent = NumberFormat.getPercentInstance(Locale.GERMAN);
        System.out.println(nfPercent.format(a));
    }

    //metoda do walutowego zapisu liczby
    public static void currencyFormat(double a) {
        NumberFormat nfCurrencyLocal = NumberFormat.getCurrencyInstance();
        NumberFormat nfGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nfCurrencyLocal.format(a));
        System.out.println(nfGermany.format(a));
    }
}
