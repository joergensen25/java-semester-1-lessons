public class Test {
    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Summen fra 1 til 10 er " + sum(1, 10));
        System.out.println("Summen fra 20 til 37 er " + sum(20, 37));
        System.out.println("Summen fra 35 til 49 er " + sum(35, 49));
    }
}
