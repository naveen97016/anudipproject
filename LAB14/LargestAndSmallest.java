package projectanudip;

public class LargestAndSmallest {

    // Method to find the largest element in an array
    public static int findLargest(int[] arr) {
        int largest = arr[0]; // Initialize largest to the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }
        return largest; // Return the largest element found
    }

    // Method to find the smallest element in an array
    public static int findSmallest(int[] arr) {
        int smallest = arr[0]; // Initialize smallest to the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if current element is smaller
            }
        }
        return smallest; // Return the smallest element found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 7, 6, 4}; // Sample array

        // Find the largest and smallest elements in the array
        int largest = findLargest(arr);
        int smallest = findSmallest(arr);

        // Print the results
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Smallest element in the array: " + smallest);
    }
}
