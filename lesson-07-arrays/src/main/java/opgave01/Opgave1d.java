package opgave01;

import java.util.Arrays;

public class Opgave1d {
    public static int crossSum (int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
    public static int[] crossSums(int[] integerArray) {
        int[] result = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            result[i] = crossSum(integerArray[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] integerArray = {1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };
        int[] sums = crossSums(integerArray);
        System.out.println(Arrays.toString(sums));
    }

}

