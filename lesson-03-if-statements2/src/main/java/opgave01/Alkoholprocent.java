package opgave01;

import java.util.Scanner;

public class Alkoholprocent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angiv alder: ");
        double alder = input.nextDouble();

        System.out.print("Angiv alkoholprocent: ");
        double alkoholprocent = input.nextDouble();

        if (alder >= 18) {
            System.out.println("En person på " + alder + " år må købe produkter med " +
                    "en alkoholprocent på " + alkoholprocent); }
        else if (alkoholprocent >= 16.5) {
            System.out.println("En person på " + alder + " år må ikke købe produkter " +
                    "med en alkoholprocent på " + alkoholprocent); }
        else if (alkoholprocent > 1.2 && alder >= 16) {
            System.out.println("En person på " + alder + " år må købe produkter med " +
                    "en alkoholprocent på " + alkoholprocent); }
        else if (alkoholprocent > 1.2) {
            System.out.println("En person på " + alder + " år må ikke købe produkter " +
                    "med en alkoholprocent på " + alkoholprocent); }
        else if (alkoholprocent <= 1.2 && alder < 16) {
            System.out.println("En person på " + alder + " år må købe produkter " +
                    "med en alkoholprocent på " + alkoholprocent); }
        else {
            System.out.println("En person på " + alder + " år må ikke købe produkter " +
                    "med en alkoholprocent på " + alkoholprocent); }
        }
}
