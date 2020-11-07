public class MaxDigit {

    public static int maxDigit(int number) {
        int mod = 0;
        int largest = 0;
        while (number > 0) {
            mod = number % 10;
            number = number / 10;
            if (mod > largest) {
                largest = mod;
            }
        }
        return largest;
    }
}
