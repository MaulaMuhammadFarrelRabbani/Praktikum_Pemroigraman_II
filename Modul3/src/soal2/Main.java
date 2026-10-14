package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        int jumlahNegara = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal = input.nextInt();
                int bulan = input.nextInt();
                int tahun = input.nextInt();
                input.nextLine();
                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }

        for (Negara negara : daftarNegara) {
            negara.tampilkanDetail(namaBulan);
            System.out.println();
        }
        input.close();
    }
}