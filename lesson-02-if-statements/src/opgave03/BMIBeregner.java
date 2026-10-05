package opgave03;

import java.util.Scanner;

public class BMIBeregner {
    public static void main(String[] args) {
        // Dette program skal beregne BMI, ved at udspørge brugeren for højde og vægt.
        // BMI beregnes med formlen BMI = vægt / højde * højde
        Scanner input = new Scanner(System.in);

        // Bed brugeren om højde og vægt
        System.out.print("Angiv vægt i kg: ");
        double vægt = input.nextDouble();

        System.out.print("Angiv højde i meter, f.eks. 1,78: ");
        double højde = input.nextDouble();

        // Bestem BMI
        double BMI = vægt / (højde * højde);

        // Vis resultat
        // Angiv evt. vægtklasser

        if (højde > 3) {
            System.out.println("Forkert input. Angiv højde i meter, f.eks. 1,74"); }
        else if (BMI >= 40) {
            System.out.printf("BMI er beregnet til " + BMI + " og du klassificeret som fedme klasse 3"); }
        else if (BMI >= 35) {
            System.out.printf("BMI er beregnet til " + BMI + " og du klassificeret som fedme klasse 2"); }
        else if (BMI >= 30) {
            System.out.printf("BMI er beregnet til " + BMI + " og du klassificeret som fedme klasse 1"); }
        else if (BMI >= 25) {
            System.out.printf("BMI er beregnet til " + BMI + " og du klassificeret som overvægtig"); }
        else if (BMI >= 18.5) {
            System.out.printf("BMI er beregnet til " + BMI + " og du klassificeret som normalvægtig"); }
        else if (BMI < 18.5) {
            System.out.printf("BMI er beregnet til " + BMI + " og du klassificeret som undervægtig"); }
            }
        }
