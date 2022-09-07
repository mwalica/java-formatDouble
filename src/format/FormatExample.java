package format;

import java.util.Locale;

public class FormatExample {
    public static void main(String[] args) {
        double num1 = 12432342.2335345;

        //2 decimal points
        String pattern = "%,.2f";//przecinek dodaje grupowanie co 3 w dużych liczbach
        System.out.println(String.format(pattern, num1));

        //4 decimal points
        System.out.println(String.format("%,.4f", num1));

        //20 digits, if enough digit, puts 0
        String result3 = String.format("%020.2f", num1);
        System.out.println(result3);

        //10 decimal points, if not enough digit, puts 0
        String result4 = String.format("%,.010f", num1);
        System.out.println(result4);

        //in scientist format
        String result5 = String.format("%e", num1);
        System.out.println(result5);

        //different locale - US
        String result6 = String.format(Locale.US, "%,.4f", num1);
        System.out.println("US: " + result6);

        //different locale - GERMANY
        String result7 = String.format(Locale.GERMANY, "%,.4f", num1);
        System.out.println("GERMANY: " + result7);

        //different locale - FRANCE
        String result8 = String.format(Locale.FRANCE, "%,.4f", num1);
        System.out.println("FRANCE: " + result8);

        //different locale - POLAND
        Locale poland = new Locale("pl");
        String result9 = String.format(poland, "%,.4f", num1);
        System.out.println("POLAND: " + result8);


    }
}
