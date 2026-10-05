package opgave04;

import java.util.Scanner;

public class Skatteberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angiv månedslån i kr: ");
        double indkomst = input.nextDouble();
        double årligIndkomst = indkomst * 12;
        double skatPrMåned = (årligIndkomst-48000) / 12 * 0.37;

        System.out.println("Månedsbeløb til skat er " + skatPrMåned);
    }
}
