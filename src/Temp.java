import java.util.Locale;

public class Temp {

    public static void main(String[] args) {

        double num = 125678.95645645674;
        String pattern = "%,.2f";

        String roundNum = String.format(pattern, num);
        String roundNum2 = String.format(Locale.US, pattern, num);
        String roundNum3 = String.format(Locale.GERMAN, "%,.3f", num);

        System.out.println("num: " + num);
        System.out.println("roundNum: " + roundNum);
        System.out.println("roundNum2 (US): " + roundNum2);
        System.out.println("roundNum3 (GER): " + roundNum3);
    }
}
