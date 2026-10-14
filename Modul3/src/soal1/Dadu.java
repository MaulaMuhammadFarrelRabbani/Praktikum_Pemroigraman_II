package soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu() {
        acaknilai();
    }

    public void acaknilai(){
        Random rand = new Random();
        this.nilai = rand.nextInt(6) + 1;
    }

    public int getNilai() {
        return this.nilai;
    }
}