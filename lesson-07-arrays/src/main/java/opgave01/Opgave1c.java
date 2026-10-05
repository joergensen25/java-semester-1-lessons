package opgave01;

public class Opgave1c {
    public static void main(String[] args) {
        int integerArray[] = {10950, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002};

        int sum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            sum += integerArray[i];
        }
        double gennemsnit = sum / integerArray.length;
        System.out.println(gennemsnit);
    }

}
