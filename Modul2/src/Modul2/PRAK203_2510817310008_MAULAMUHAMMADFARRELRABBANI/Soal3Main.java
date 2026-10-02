package Modul2.PRAK203_2510817310008_MAULAMUHAMMADFARRELRABBANI;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kurang tanda titik koma (;) di akhir perintah.
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Di baris ini ada menambahkan baris baru, Sebelumnya variabel umur tidak pernah diisi sehingga bernilai default 0.
        p1.umur = 17;

        // Pada baris ini output tidak sesuai soal. yang diminta adalah "Nama: ", bukan "Nama Pegawai: ".
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini output tidak sesuai soal. kurang tambahan teks kata " tahun" di belakang nilai umurnya.
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}