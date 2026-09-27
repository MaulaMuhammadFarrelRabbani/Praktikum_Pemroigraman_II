import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static final double PHI = 3.14;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Masukan jari-jari: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukan tinggi: ");
        double tinggi = input.nextDouble();
        double volume = PHI * jariJari * jariJari * tinggi;

        System.out.print("Volume tabung dengan jari-jari " + jariJari + " cm dan ");
        System.out.println("tinggi " + tinggi + " cm adalah " + String.format(Locale.US, "%.3f", volume) + " m3");
        input.close();
    }
}