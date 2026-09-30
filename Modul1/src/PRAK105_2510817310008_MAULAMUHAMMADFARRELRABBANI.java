import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static final double PHI = 3.14;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double jarijari;
        do{
            System.out.print("Masukan jari-jari: ");
            jarijari = input.nextDouble();
            if (jarijari<= 0) System.out.println("Jari-jari harus lebih besar dari 0.\n");
        } while (jarijari <= 0);

        double tinggi;
        do {
            System.out.print("Masukan tinggi: ");
            tinggi = input.nextDouble();
            if (tinggi <= 0) System.out.println("Tinggi harus lebih besar dari 0.\n");
        } while (tinggi <= 0);

        double volume = PHI * jarijari * jarijari * tinggi;
        System.out.print("Volume tabung dengan jari-jari " + jarijari + " cm dan ");
        System.out.println("tinggi " + tinggi + " cm adalah " + String.format(Locale.US, "%.3f", volume) + " m3");
        input.close();
    }
}