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

        System.out.print("Masukan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukan Berat Badan: ");
        double beratBadan = input.nextDouble();

        String[] namaBulan = {
                "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        String bulanStr = "";
        if (bulanLahir >= 1 && bulanLahir <= 12) {
            bulanStr = namaBulan[bulanLahir];
        } else {
            bulanStr = "(Bulan Tidak Valid)";
        }

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulanStr + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        input.close();
    }
}