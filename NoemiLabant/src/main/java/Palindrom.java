public class Palindrom {

    public static boolean isPalindrom (int number) {
        String newstring = Integer.toString(number);
        int numberLength = newstring.length();
        for (int i = 0; i <= numberLength / 2 ; i++) {
            if (newstring.charAt(i) != newstring.charAt(numberLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
