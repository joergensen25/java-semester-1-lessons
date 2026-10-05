package opgave04;

import java.util.Scanner;

public class TopskatBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Angiv månedslån i kr: ");
        double indkomst = input.nextDouble();
        double aarsIndkomst = indkomst * 12;
        double skatPrMaaned = (aarsIndkomst - 48000) / 12 * 0.37;
        double topskatPrMaaned = 0;
        if (aarsIndkomst > 568900) {
            topskatPrMaaned = (aarsIndkomst - 568900) / 12 * 0.15;
        }
        System.out.println("Månedsbeløb til skat er " + skatPrMaaned+ " kr. og " + topskatPrMaaned + " kr. i topskat");
    }
}
