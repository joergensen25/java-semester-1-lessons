import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indsæt et tal for at udskrive en tabel : ");
        int n = input.nextInt();
        int i = 1;
        while(i <= 10) {
            System.out.printf("%4d", n*i);
            i++;
        }
        System.out.println();
        input.close();
    }
}
