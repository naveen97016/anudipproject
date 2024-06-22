package projectanudip;

public class ExceptionHandlingDemo {

    // Method to demonstrate handling array index out of bounds exception
    public static void handleArrayIndexOutOfBounds() {
        try {
            int[] arr = {1, 2, 3};
            // Attempt to access an element outside the array bounds
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // Method to demonstrate handling arithmetic exception
    public static void handleArithmeticException() {
        try {
            int a = 10;
            int b = 0;
            // Attempt to divide by zero
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call methods to demonstrate exception handling
        handleArrayIndexOutOfBounds();
        handleArithmeticException();
    }
}

