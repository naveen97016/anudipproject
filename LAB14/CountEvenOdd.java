package projectanudip;
import java.util.Scanner;

public class CountEvenOdd {

    // Method to count even and odd numbers in the array
    public static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        // Iterate through each element in the array
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++; // Increment evenCount if number is even
            } else {
                oddCount++; // Increment oddCount if number is odd
            }
        }

        // Print the results
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size]; // Create an array of the given size

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to count even and odd numbers
        countEvenOdd(arr);
    }
}

