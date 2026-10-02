package Modul2.PRAK202_2510817310008_MAULAMUHAMMADFARRELRABBANI;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    private String pembeli;

    public void setPembeli(String namaPembeli) {
        this.pembeli = namaPembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public double getPajak() {
        return this.harga * 0.11;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

}