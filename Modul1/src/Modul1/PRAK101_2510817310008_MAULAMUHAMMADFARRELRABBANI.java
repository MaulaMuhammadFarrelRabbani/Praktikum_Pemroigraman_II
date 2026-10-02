package Modul1;

import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Masukan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        int tanggalLahir = 0, bulanLahir = 0, tahunLahir = 0;
        boolean tanggalValid = false;

    do {
        System.out.print("Masukan Tanggal Lahir: ");
        tanggalLahir = input.nextInt();

        System.out.print("Masukan Bulan Lahir: ");
        bulanLahir = input.nextInt();

        System.out.print("Masukan Tahun Lahir: ");
        tahunLahir = input.nextInt();

        int maxHari = 31;
        if (bulanLahir == 4 || bulanLahir == 6 || bulanLahir == 9 || bulanLahir == 11) {
            maxHari = 30;
        } else if (bulanLahir == 2) {
            // Cek Tahun Kabisat
            if ((tahunLahir % 4 == 0 && tahunLahir % 100 != 0) || (tahunLahir % 400 == 0)) {
                maxHari = 29;
            } else {
                maxHari = 28;
            }
        }

        if (bulanLahir >= 1 && bulanLahir <= 12 && tanggalLahir >= 1 && tanggalLahir <= maxHari && tahunLahir > 0) {
            tanggalValid = true;
        } else {
            System.out.println(">> Tanggal tidak valid.\n");
        }
    } while (!tanggalValid);

    int tinggibadan;
    do{
        System.out.print("Masukan Tinggi Badan: ");
        tinggibadan = input.nextInt();
        if (tinggibadan <= 0) System.out.println(">> ERROR: Tinggi badan harus lebih dari 0!\n");
    } while (tinggibadan <= 0);

    double beratbadan;
    do{
        System.out.print("Masukan Berat Badan: ");
        beratbadan = input.nextDouble();
        if (beratbadan <= 0) System.out.println(">> ERROR: Berat badan harus lebih dari 0!\n");
    } while (beratbadan <= 0);

        String[] namaBulan = {
                "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

    String bulanStr = namaBulan[bulanLahir];
    System.out.println("\nNama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulanStr + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggibadan + " cm dan Berat Badan " + beratbadan + " kilogram");

        input.close();
    }
}