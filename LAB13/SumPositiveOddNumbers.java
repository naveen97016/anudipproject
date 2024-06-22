package projectanudip;

public class SumPositiveOddNumbers {
    // Method to sum positive odd numbers in an array
    public static int sumPositiveOddNumbers(int[] arr) {
        int total = 0;
        // Iterate through each number in the array
        for (int num : arr) {
            // Check if the number is positive and odd
            if (num > 0 && num % 2 != 0) {
                total += num; // Add to total if condition is met
            }
        }
        
        return total; // Return the calculated sum
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, 5, 6, -7, 8, 9, -10}; // Sample array
        int result = sumPositiveOddNumbers(arr); // Call the method with sample array
        
        // Print the result
        System.out.println("Sum of positive odd numbers: " + result);
    }
}
