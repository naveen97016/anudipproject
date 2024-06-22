package projectanudip;

public class ArraySum {

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] arr) {
        int sum = 0; // Initialize sum to 0
        
        // Iterate through each element in the array and add it to sum
        for (int num : arr) {
            sum += num;
        }
        
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 7, 6, 4}; // Sample array

        // Calculate the sum of the array elements
        int sum = calculateSum(arr);

        // Print the result
        System.out.println("Sum of array elements: " + sum);
    }
}
