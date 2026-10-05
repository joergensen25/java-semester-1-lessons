package Opgave2;

import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indstast antallet af tall: ");
        int antal = input.nextInt();

        int størsteTal = Integer.MIN_VALUE;
        int mindsteTal = Integer.MAX_VALUE;
        int antalLigeTal = 0;
        int antalUligeTal = 0;

        for (int i = 0; i < antal; i++) {
            System.out.print("Indstast tal: ");
            int tal = input.nextInt();
            if (tal > størsteTal) {
                størsteTal = tal;
            } else if (tal < mindsteTal) {
                mindsteTal = tal;
            }
            System.out.println("Største tal er: " + størsteTal);
            System.out.println("Mindste tal er: " + mindsteTal);
            System.out.println("Antal lige tal er: " + antalLigeTal);
            System.out.println("Antal ulige tal er: " + antalUligeTal);
        }
    }
}


