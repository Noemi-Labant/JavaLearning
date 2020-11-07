public class Application {

    public static void main (String[] args) {

        int value = SumOfFirst.sumOfFirst();
        int smartValue = SumOfFirst.smartSumOfFirst();
        System.out.println( "The sum of first 100 number = " + value);
        System.out.println( "The sum of first 100 number = " + smartValue);

        int smallestnumber = SmallestNumber.smallestNumber();
        System.out.println("The smallest value is: " + smallestnumber);

        int number = 56792;
        int maxdigit = MaxDigit.maxDigit(number);
        System.out.println("The max digit from number is : " + maxdigit);

        number = 567927;
        boolean isPalindrom = Palindrom.isPalindrom(number);
        int number2 = 55155;
        boolean isPalindrom2 = Palindrom.isPalindrom(number2);
        System.out.println("Check if number " + number + " is palindrom : " + isPalindrom);
        System.out.println("Check if number " + number2 + " is palindrom : " + isPalindrom2);

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = PrimeNumber.isPrimeNumber(i);
            if (isPrime) {
                System.out.println(i + " is prime!");
            }
        }
    }

}
