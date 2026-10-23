package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaHewan = input.nextLine();
        String rasHewan = input.nextLine();

        HewanPeliharaan hewan1 = new HewanPeliharaan(rasHewan, namaHewan);

        hewan1.display();

        input.close();
    }
}