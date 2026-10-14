package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> DaftarDadu = new LinkedList<>();

        int jumlahDadu = input.nextInt();
        int TotalNilai = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            DaftarDadu.add(new Dadu());
        }

        for (int i = 0; i < DaftarDadu.size(); i++) {
            int nilaiSaatIni = DaftarDadu.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiSaatIni);
            TotalNilai += nilaiSaatIni;
        }

        System.out.println("Total nilai dadu keseluruhan " + TotalNilai);
        input.close();
    }
}