public class Opgave2b {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int kvadrattal;
        while (i < 10) {
            kvadrattal = (i * i);
            sum = sum + kvadrattal;
            i++;
        }
        System.out.println("Summen af alle kvadrattal mindre end 100 er " + sum);
    }
}
