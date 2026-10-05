package opgave01;

import java.util.Scanner;

public class MomsBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast beløb uden moms: ");
        double købsBeløb = input.nextDouble();

        double moms = købsBeløb * 0.250;
      //  System.out.printf("Momsbeløbet er " + (int) (moms * 100 / 100.0) + " kr.");
        System.out.printf("Momsbeløbet er " + moms + " kr.");
    }
}
