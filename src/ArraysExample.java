import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        
        // Accessing elements
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.println("First name: " + names[0]);
        
        // Changing elements
        names[1] = "Bobby";
        System.out.println("Changed name: " + names[1]);
        
        // Amount of elements in array
        System.out.println("Array length: " + names.length);
        
        // Multi-dimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Element at (1,1): " + matrix[1][1]);
        
        // Array methods
        int[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of number 3: " + index);
    }
}