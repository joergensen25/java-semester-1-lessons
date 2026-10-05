public class Opgave2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i+=2)
            sum += i;
        System.out.println("Summen af lige tal fra 2 til 100, inklusiv 100 er " + sum);
    }
}
