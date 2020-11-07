public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            for (int n = 3; n <= Math.sqrt(number); n = n + 2) {
                if (number % n == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}