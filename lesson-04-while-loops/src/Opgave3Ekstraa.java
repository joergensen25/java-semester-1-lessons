public class Opgave3Ekstraa {

    public static void printTablesWhile() {
        int i = 1;  // tæller for tabellerne
        while (i <= 10) {
            int j = 1;  // tæller for multiplikation i tabellen
            while (j <= 10) {
                System.out.printf("%4d", i * j);
                j++;
            }
            System.out.println();  // ny linje efter hver tabel
            i++;
        }
    }

    public static void main(String[] args) {
        printTablesWhile();
    }
}
