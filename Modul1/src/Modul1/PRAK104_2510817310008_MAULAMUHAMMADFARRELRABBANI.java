package Modul1;

import java.util.Scanner;

public class PRAK104_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu1 = input.next();
        String abu2 = input.next();
        String abu3 = input.next();

        System.out.print("Tangan Bagas: ");
        String bagas1 = input.next();
        String bagas2 = input.next();
        String bagas3 = input.next();

        String[] abu = {abu1, abu2, abu3};
        String[] bagas = {bagas1, bagas2, bagas3};

        int poinAbu = 0;
        int poinBagas = 0;
        for (int i = 0; i < 3; i++) {
            if (abu[i].equals(bagas[i])) {
                continue;
            } else if ((abu[i].equals("B") && bagas[i].equals("G")) ||
                    (abu[i].equals("G") && bagas[i].equals("K")) ||
                    (abu[i].equals("K") && bagas[i].equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }
}