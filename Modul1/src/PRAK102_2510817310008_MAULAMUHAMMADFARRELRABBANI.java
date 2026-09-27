import java.util.Scanner;

public class PRAK102_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka awal: ");
        int angka = input.nextInt();
        int i = 0;

        while (i <= 10) {
            int angkaCetak;

            if (angka % 5 == 0) {
                angkaCetak = (angka / 5) - 1;
            } else {
                angkaCetak = angka;
            }
            System.out.print(angkaCetak);

            if (i < 10) {
                System.out.print(", ");
            }
            angka++;
            i++;
        }
        System.out.println();
        input.close();
    }
}