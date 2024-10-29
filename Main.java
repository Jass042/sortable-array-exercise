import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortableArray sorter = new SortableArray();

        // Test sorting an integer array
        int[] intArray = {5, 3, 8, 1, 2};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        sorter.sortIntArray(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        // Test sorting a string array
        String[] stringArray = {"apple", "orange", "banana", "kiwi"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        sorter.sortStringArray(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}


