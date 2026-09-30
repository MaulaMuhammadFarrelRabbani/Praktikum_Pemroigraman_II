import java.util.Scanner;

public class PRAK102_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int angka;
    do {
        System.out.print("Masukan angka awal: ");
        angka = input.nextInt();
        if (angka < 0) System.out.println("angka tidak boleh negatif");
    } while (angka < 0);

        int i = 0;
        while (i <= 9) {
            int angkacetak;
            if (angka % 5 == 0) {
                angkacetak = (angka / 5) - 1;
            } else {
                angkacetak = angka;
            }
            System.out.print(angkacetak);

            if (i < 9) {
                System.out.print(", ");
            }
            angka++;
            i++;
        }
        System.out.println();
        input.close();
    }
}