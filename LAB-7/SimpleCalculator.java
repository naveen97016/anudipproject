package projectanudip;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("SIMPLE CASCIO");
        System.out.print("Enter first num: ");
        double num1 = sc.nextDouble();            
        System.out.print("Enter sec num: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /) or 'exit' to quit: ");
        String op = sc.next();    
        if (op.equals("exit")) {
        break;
        }
        double result;
        if (op.equals("+")) {
        result = num1 + num2;
        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (op.equals("-")) {
        result = num1 - num2;
        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (op.equals("*")) {
        result = num1 * num2;
        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (op.equals("/")) {
        if (num2 == 0) {
        System.out.println("Error: Division by zero is not allowed.");
        } else {
        result = num1 / num2;
        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        }
        } else {
        System.out.println("Error: Invalid operation.");
        }
        System.out.println();
        }
    }
}