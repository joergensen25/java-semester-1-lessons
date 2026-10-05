package opgave02;

import java.util.Scanner;

public class MilTilKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast distance i mil: ");
        double afstandMil = input.nextDouble();

        double afstandKm = afstandMil * 1.609344;

        System.out.printf("Afstand i km er %.2f", + afstandKm);



    }
}
