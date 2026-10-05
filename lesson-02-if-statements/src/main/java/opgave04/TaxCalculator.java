package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast månedlig indkomst ");
        int income = scanner.nextInt();
        int tax = calculateTax(income);
        System.out.println("Årlig skat er " + tax);
    }

    public static int calculateTax(int monthlyIncome) {
        int BASEDECUTION = 48_000;
        int yearlyIncome = monthlyIncome * 12;
        if (yearlyIncome <= 0) {
            return 0;
        }
        return -1;
    }
}
