package projectanudip;

public class MultipleCatchFinallyDemo {

    // Method to demonstrate multiple catch statements and finally block
    public static void demonstrateExceptions() {
        int[] arr = {1, 2, 3};
        int a = 10;
        int b = 0;

        try {
            // Attempt to access an element outside the array bounds
            System.out.println("Array element: " + arr[3]);

            // Attempt to divide by zero
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }

    public static void main(String[] args) {
        // Call method to demonstrate multiple catch statements and finally block
        demonstrateExceptions();
    }
}

