package Modul2.PRAK201_2510817310008_MAULAMUHAMMADFARRELRABBANI;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlah_beli;
    private double total;
    private double diskon;

    Buah(String nama, double berat, double harga, double jumlah_beli){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
        this.total = harga * (jumlah_beli/berat);
    }

    public double getDiskon(){
        double diskon = 0;
        for(int i = 0; i < (int)(jumlah_beli / 4); i++){
            diskon += (harga * 4) * 0.02;
        }
        return diskon;
    }

    public void info(){
        this.diskon = getDiskon();
        double HargaSetelahDiskon = this.total - this.diskon;

        System.out.println("Nama Buah: " + this.nama);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + this.harga);
        System.out.println("Jumlah Beli: " + this.jumlah_beli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", this.total);
        System.out.printf("Total Diskon: Rp%.2f\n", this.diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", HargaSetelahDiskon);
    }
}
