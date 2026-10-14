package soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public void tampilkanDetail(HashMap<Integer, String> petaBulan) {
        String sebutanPemimpin = "";

        if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            sebutanPemimpin = "Presiden";
        } else if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
            sebutanPemimpin = "Perdana Menteri";
        } else if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            sebutanPemimpin = "Raja";
        }

        System.out.println("Negara " + nama + " mempunyai " + sebutanPemimpin + " bernama " + namaPemimpin);

        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + petaBulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }
    }
}