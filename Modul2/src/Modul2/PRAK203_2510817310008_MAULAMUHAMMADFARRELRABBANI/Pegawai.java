package Modul2.PRAK203_2510817310008_MAULAMUHAMMADFARRELRABBANI;

// Pada baris ini ada error karena nama class "Employee" tidak sesuai dengan nama file "Pegawai.java".
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena ada tipe data char hanya untuk 1 karakter, jadi tidak bisa menampung teks kalimat. Seharusnya String.
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena methodnya tidak memiliki parameter, padahal file Main mengirim argumen teks (String).
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}