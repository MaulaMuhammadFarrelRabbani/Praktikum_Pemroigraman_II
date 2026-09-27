import java.util.Scanner;

public class PRAK103_2510817310008_MAULAMUHAMMADFARRELRABBANI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int bilangan = input.nextInt();
        int dicetak = 0;
        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                dicetak++;

                if (dicetak < n) {
                    System.out.print(", ");
                }
            }
            bilangan++;

        } while (dicetak < n);

        System.out.println();
        input.close();
    }
}