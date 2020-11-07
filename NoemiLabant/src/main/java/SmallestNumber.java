public class SmallestNumber {

    public static int smallestNumber() {
        int array[] = {10, 11, 12, 46, 98, 44, 9, 15, 81};
        int smallest = array[0];
        for (int i = 0; i <= 8; i++) {
            if (array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
}
