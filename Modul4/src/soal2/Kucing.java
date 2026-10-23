package soal2;

public class Kucing extends HewanPeliharaan {
    private String warnabulu;

    public Kucing(String n, String r, String w) {
        super(n, r);
        this.warnabulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.warnabulu);
    }
}