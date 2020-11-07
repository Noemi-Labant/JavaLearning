public class SumOfFirst {

    public static int sumOfFirst() {
        int sum = 0;
        for (int x = 1; x <= 100; x++) {
            sum = sum + x;
        }
        return sum;
    }

    public static int smartSumOfFirst() {
        int sum = 0;
        int n = 100;
        sum = n * (n + 1)/ 2;
        return sum;
    }
}
